 class Solution:
    def XXX(self, m: int, n: int) -> int:
        dp = [[1]*n]*m
        for i in range(1,m):
            for j in range(1,n):
                dp[i][j] = dp[i][j-1]+dp[i-1][j]
        return dp[-1][-1]

