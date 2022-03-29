 class Solution:
    def XXX(self, strs: List[str]) -> str:
        if strs == []:         # 字符串为空返回''
            return ''
        elif len(strs) == 1:   # 若列表仅有一个单词，返回该单词
            return strs[0]
        else:
            minlen = len(min(strs, key=len))  # 找到最短的单词长度
            s = ''
            for i in range(1, minlen + 1):    # 最多遍历 minlen 次
                # 每次遍历同时从每个单词取相同长度的前缀加入集合，集合中不会有重复单词
                # 列表中每个单词的相同长度前缀相同，因此集合长度为1
                if len({s[:i] for s in strs}) == 1: 
                    # 将s值更新为当前s长度与任意一个单词[:i]的部分中较大的那个值
                    # 为了避免不存在strs[1]，此处默认为第一个
                    s = max(s, strs[0][:i])          
            return s

