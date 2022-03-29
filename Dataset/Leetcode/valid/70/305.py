class Solution:
    def XXX(self, n: int) -> int:
        dp = [1, 2] 
        for i in range(2, n):
            dp[i % 2] = dp [(i -1) % 2] + dp[(i - 2) % 2]
        return dp[(n - 1) % 2]

