 class Solution:
    def XXX(self, m: int, n: int) -> int:
        dp = [1 for _ in range(n)]
        for i in range(m-2, -1, -1):
            for j in range(n-2, -1, -1):
                dp[j] = dp[j] + dp[j+1]
        return dp[0]

