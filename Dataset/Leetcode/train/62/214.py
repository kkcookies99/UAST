 class Solution:
    def XXX(self, m: int, n: int) -> int:
        # 根据画格子，3*3的即可总结出规律，然后写出状态转移方程
        if m == 1 or n == 1: return 1
        dp = [[1] * n for _ in range(m)]
        dp[0][1] = dp[1][0] = 1
        dp[1][1] = 2
        for i in range(1, m):
            for j in range(1, n):
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1]
        return dp[-1][-1]

