 class Solution(object):
    def XXX(self, s):
        """
        :type s: str
        :rtype: int
        """
        l,result = [],0
        for i in range(len(s)):
            if s[i] in l:
                result = max(len(l),result)
                l = l[l.index(s[i])+1:i]
            l.append(s[i])
        return max(len(l),result)
                

