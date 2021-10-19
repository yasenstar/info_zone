import jieba

def get_text(url):
    # 获取报告的分词列表
    txt = open(url, "r", encoding="utf-8").read()   # 读取指定路径下的文件
    words = jieba.lcut(txt)     # 对文件内容进行分词操作
    return words

def counts(words):
    # 统计各个词语出现的次数并返回一个按照出现次数排序的列表
    counts_dict = {}
    # 遍历统计
    for word in words:
        if len(word) == 1:
            continue
        counts_dict[word] = counts_dict.get(word, 0) +1
    counts_list = list(counts_dict.items()) # 将字典转化列表
    counts_list.sort(key=lambda x: x[1], reverse=True) # 将列表按照出现的次数排序
    return counts_list

def main():
    url = input(r"请输入文件路径: ")
    words = get_text(url)
    counts_list = counts(words)
    n = int(input("请输入获取多次排名的词语列表: "))
    for i in range(n):
        word, count = counts_list[i]
        print("出现第{}名的词语是： \"{}\"共出现<{}>次。 ".format(i + 1, word, count))

main()