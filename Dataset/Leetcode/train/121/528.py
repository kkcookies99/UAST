 class Solution:
    def XXX(self, prices: list[int]) -> int:

        # dp[i] 第i天的卖出交易情况最大值
        if len(prices)<2:
            return 0
        n = len(prices)
        dp = [0 for _ in range(n)]
        dp[1] = prices[1]-prices[0]

        for i in range(2,n):
            
            dp[i] = max(dp[i-1]+(prices[i]-prices[i-1]),prices[i]-prices[i-1])
           
        return max(max(dp),0)

