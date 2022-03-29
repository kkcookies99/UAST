 class Solution:
    def XXX(self, prices: List[int]) -> int:
        max_money = 0
        min_price = prices[0]
        for i in range(1, len(prices)):
            if prices[i] < min_price:
                min_price = prices[i]
            if (prices[i] - min_price) > max_money:
                max_money = prices[i] - min_price
        return max_money

