 class Solution:
    def XXX(self, prices: List[int]) -> int:
        min_buy = prices[0]
        max_profit = 0
        for i in prices[1:]:
            min_buy = min(min_buy,i)
            max_profit = max(i-min_buy,max_profit)
        return max_profit

