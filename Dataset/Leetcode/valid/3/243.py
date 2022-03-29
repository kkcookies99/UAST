 class Solution(object):
    def XXX(self, s):
        """
        :type s: str
        :rtype: int
        """
        rtype = 0 # 用于存储s1的长度
        s1 = '' # 子串
        for i in range(len(s)):
            if s[i] not in s1:
                s1 += s[i]
            else:
                index = s1.index(s[i])
                s1 = s1[index+1:]+s[i]
            rtype = max(rtype, len(s1))
        return rtype

