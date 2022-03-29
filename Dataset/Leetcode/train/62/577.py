class Solution:
    def XXX(self, m: int, n: int) -> int:
        """动规
        """
        dp = [1 for _ in range(m)]
        for i in range(1, n):
            for j in range(1, m):
                dp[j] = dp[j-1] + dp[j]
        return dp[-1]

