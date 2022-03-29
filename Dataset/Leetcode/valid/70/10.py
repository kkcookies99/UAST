class Solution:
    def XXX(self, n: int) -> int:
        # dp[i]表示爬到第i级楼梯的种数， (1, 2) (2, 1)是两种不同的类型
        dp = [0] * (n + 1)
        dp[0] = 1
        for i in range(n+1):
            for j in range(1, 3):
                if i>=j:
                    dp[i] += dp[i-j]
        return dp[-1]

