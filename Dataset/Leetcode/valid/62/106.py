 class Solution:
    def XXX(self, m: int, n: int) -> int:
        dp = [0 for _ in range(n)]
        for i in range(m):
            for j in range(n):
                if i == 0 or j == 0:
                    dp[j] = 1
                else:
                    dp[j] = dp[j] + dp[j - 1]
        return dp[-1]
        

