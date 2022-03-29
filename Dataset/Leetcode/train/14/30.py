 class Solution(object):
    def XXX(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """

        a=strs[0] # 找到第一个字符串
        b=len(a) 
        c=""

        if not strs: return ""

        for i in range(b):  # 遍历第一个字符串的长度
            for j in strs[1:]:
                if i==len(j):
                    return c
                if a[i]!=j[i]:
                    return c
            c+=a[i]
        return c

