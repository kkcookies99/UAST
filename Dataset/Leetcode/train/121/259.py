 class Solution:
    def XXX(self, prices: List[int]) -> int:
        if not prices:return 0
        profit = 0
        min_prices = prices[0]
        for i in prices:
            profit = i - min_prices if i - min_prices > profit else profit
            min_prices = i if i < min_prices else min_prices
        return profit

