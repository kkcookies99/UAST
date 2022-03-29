class Solution:
    def XXX(self, m: int, n: int) -> int:
        dp = [[1 for j in range(n)] for i in range(m)]
        for i in range(1,n):
            for j in range(1,m):

                dp[j][i] = dp[j-1][i]+dp[j][i-1]
        return dp[-1][-1]```

