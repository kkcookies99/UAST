 class Solution:
    def XXX(self, m: int, n: int) -> int:
        dp = [1 for _ in range(n)]
        for row in range(1, m):
            for col in range(1,n):
                dp[col] = dp[col] + dp[col-1]
        return dp[-1]

