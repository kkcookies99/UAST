 class Solution(object):
    def XXX(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        if not strs:   #如果为空，直接返回""
            return ""        # 这个哪里错了啊
        n = len(strs[0])
        m = len(strs)
        thesame = ''
        for i in range(n):    #将第一个元素中的所有字符都遍历一遍
            # 将strs中的所有元素都遍历一遍
            for j in range(1,m,1):
                if strs[0][i] != strs[j][i]:
                    if i < 0:
                        return ""
                    return thesame
            thesame += strs[0][i]

