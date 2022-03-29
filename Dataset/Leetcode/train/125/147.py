 class Solution(object):
    def XXX(self, s):
        """
        :type s: str
        :rtype: bool
        """
        s1=''
        s=s.lower()
        for i in s:
            if (i>=0 and i<=9) or (i>='a' and i<='z'):
                s1=s1+i
        return s1 == s1[::-1]

