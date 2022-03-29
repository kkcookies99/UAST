class Solution:
    def XXX(self, n: int) -> int:
        dp = [0] * (n+1)
        dp[0] = 1
        dp[1] = 1
        if n >1:
            for i in range(2, n+1):
                dp[i] = dp[i-1] + dp[i-2]
        return dp[n]

