 class Solution:
    def XXX(self, s: str) -> str:
        if not s :
            return ""
        res = ""
        n = len(s)
        dp = [[0] * n for _ in range(n)]
        max_len = float("-inf")
        #print(dp)
        for i in range(n):
            for j in range(i,-1,-1):
                if s[i] == s[j] and (i - j < 2 or dp[i-1][j+1]):
                    dp[i][j] = 1
                if dp[i][j] and  max_len < i - j + 1:
                    #print("i,j",i,j)
                    res = s[j:i+1]
                    max_len = i - j + 1
        return res

