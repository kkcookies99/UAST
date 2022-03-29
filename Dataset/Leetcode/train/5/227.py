 class Solution(object):
    def XXX(self, s):
        if len(s) <= 1: return s
        res = s[0]
        maxlen = 0
        if s[0] == s[1]:
            res = s[0:2]
        dp = [[False for _ in range(len(s))] for _ in range(len(s))]
        for j in range(2, len(s)):
            dp[j][j] = True
            for i in range(j):
                dp[i][j] = s[i] == s[j] and (j-i<=2 or dp[i+1][j-1])
                if dp[i][j] and maxlen < j - i + 1:
                    maxlen = j-i+1
                    res = s[i:j+1]
        return res

