 class Solution(object):
    def XXX(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        if not strs:
            return ''
        if len(strs) == 1:
            return strs[0]
        
        #通过解包，然后使用zip进行并行扫描。扫描次数只会按照最短的一个字符计算
        common_prefix, sequences = '', zip(*strs)
        
        for i, v in enumerate(sequences):
            #取出的第一元素中的共同扫描的字符
            char = v[0]
            #判断并行扫描中，其余同样位置的字符是否和这个字符相等
            for j in range(1, len(v)):
                if v[j] != char:
                    return common_prefix
            #全部相等，共同前缀加上这个字符
            common_prefix += strs[0][i]
        return common_prefix

