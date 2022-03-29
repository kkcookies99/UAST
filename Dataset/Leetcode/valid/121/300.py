 class Solution:
    def XXX(self, prices: List[int]) -> int:
        # 1. 一次遍历，计算差值 T=O(n), S=O(1)

        # 2. 动态规划 T=O(n), S=O(n)
        # dp[i][0]: 第i天交易完后一直没买卖股票的最大利润
        # dp[i][1]: 第i天交易完后持有一支股票的最大利润
        # dp[i][2]: 第i天交易完后卖出一支股票的最大利润
        n = len(prices)
        dp = [[0]*3 for _ in range(n)]
        dp[0][0], dp[0][1], dp[0][2] = 0, -prices[0], 0
        for i in range(1, n):
            dp[i][0] = dp[i-1][0]
            dp[i][1] = max(dp[i-1][1], dp[i-1][0]-prices[i])
            dp[i][2] = max(dp[i-1][2], dp[i-1][1]+prices[i])
        return max(dp[-1])

