class Solution(object):
    def XXX(self, s):
        """
        :type s: str
        :rtype: int
        """
        d = {'I':1, 'V':5, 'X':10, 'L':50, 'C':100, 'D':500, 'M':1000}
        res = 0
        for i in range(len(s) - 1):
            if d[s[i]] < d[s[i+1]]:
                res -= d[s[i]]
            else:
                res += d[s[i]]
        res += d[s[-1]]
        return res

