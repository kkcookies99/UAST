 class Solution:
    def XXX(self, m: int, n: int) -> int:
        # dp[i][0] == 1 or dp[0][j] == 0
        dp = [[1] * n for _ in range(m)]
        for i in range(1, m):
            for j in range(1, n):
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1]
        return dp[-1][-1]

