 class Solution:
    def XXX(self, m: int, n: int) -> int:
        dp = [[0]*n]*m
        for i in range(m):
            for j in range(n):
                if(i == 0 or j == 0):
                    dp[i][j] = 1
                else:
                    dp[i][j] = dp[i-1][j] + dp[i][j-1]
        return dp[m-1][n-1]

