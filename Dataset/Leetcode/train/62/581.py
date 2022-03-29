class Solution:
    def XXX(self, m: int, n: int) -> int:
        dp = [[0 for _ in range(n + 1)] for _ in range(m + 1)]
        for i in range(m + 1):
            dp[i][1] = 1
        for j in range(n + 1):
            dp[1][j] = 1
        for i in range(2, m + 1):
            for j in range(2, n + 1):
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1]
        return dp[m][n]


