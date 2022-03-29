 class Solution:
    def XXX(self, prices: List[int]) -> int:
        min_price = prices[0]
        max_profit = 0
        for price_idx,price in enumerate(prices):
            if price<min_price:
                min_price = price
            profit = price-min_price
            if profit>max_profit:
                max_profit = profit
        return max_profit

