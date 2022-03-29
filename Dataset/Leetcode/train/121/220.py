 class Solution(object):
    def XXX(self, prices):
        profit = 0
        if len(prices)>0:
            buy = prices[0]
            for i in range(len(prices)):
                buy = min(buy, prices[i])
                #前i天的最小价格
                profit = max(profit, prices[i] - buy)
                #前i天的最大收益 = max{前i-1天的最大收益，第i天的价格-前i天的最小价格}
        return profit

