 class Solution:
    def XXX(self, m, n):
        dp = []
        for i in range(m):
            dp.append([1] * n)

        for i in range(1, m):
            for j in range(1, n):
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1]

        return dp[m-1][n-1]

