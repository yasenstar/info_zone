    counts_list = list(counts_dict.items()) # 将字典转化列表
    counts_list.sort(key=lambda x: x[1], reverse=True) # 将列表按照出现的次数排序
    return counts_list