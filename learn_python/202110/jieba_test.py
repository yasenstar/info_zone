# 中文分词库
import jieba

s = "党中央将疫情防控作为头等大事来抓"

# 精准模式 jieba.lcut(s) 将字符串拆分为没有冗余的分词列表
print(jieba.lcut(s))

# 全模式 jieba.lcut(s,cut_all=True) 将字符串拆分成所有可能的分词列表
print(jieba.lcut(s,cut_all=True))

# 搜索引擎模式 jieba.lcut_for_search(s) 在精准模式的基础上再拆分
print(jieba.lcut_for_search(s))