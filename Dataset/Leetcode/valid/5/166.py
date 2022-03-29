 class Solution(object):
    def XXX(self, s):
        """
        :type s: str
        :rtype: str
        """
        start, maxl = 0, 0
        for i in range(len(s)):
            if i-maxl >= 1 and s[i-maxl-1:i+1] == s[i-maxl-1:i+1][::-1]:
                start = i-maxl-1
                maxl += 2
            if i-maxl >= 0 and s[i-maxl:i+1] == s[i-maxl:i+1][::-1]:
                start = i-maxl
                maxl += 1
        return s[start:start+maxl]

