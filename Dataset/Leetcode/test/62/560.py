class Solution:
    def XXX(self, m: int, n: int) -> int:
        # 一维dp
        dp = [1] * n
        for i in range(1, m):
            for j in range(1, n):
                dp[j] += dp[j - 1]
        return dp[-1]

