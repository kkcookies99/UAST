 class Solution:
    def XXX(self, prices: List[int]) -> int:
        # 构建dp数组，dp[i]代表第i天的最大盈利
        dp = [0] * len(prices)
        temp = prices[0]

        for i in range(1, len(prices)):
            dp[i] = max(dp[i-1], prices[i] - temp)
            temp = min(temp, prices[i])
        return dp[-1]

