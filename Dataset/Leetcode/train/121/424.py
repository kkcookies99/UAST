 class Solution(object):
    def XXX(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        prices_len = len(prices)
        if prices_len == 1:
            return 0
        profit = [0] * prices_len
        profit[0] = 0
        min_price = prices[0]
        for i in range(1, prices_len):
            if prices[i] > prices[i - 1]:
                profit[i] = max(profit[i - 1] + prices[i] - prices[i - 1], prices[i] - min_price)
            min_price = min(min_price, prices[i])
        return max(profit)

