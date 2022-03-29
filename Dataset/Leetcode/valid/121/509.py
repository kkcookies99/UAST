 class Solution:
    def XXX(self, prices: List[int]) -> int:
        if len(prices)<2:
            return 0
        benfit = []
        min_=prices[0]
        max_ = 0
        for i, price in enumerate(prices):
            min_ = min(price, min_)
            max_ = max(max_, price-min_)
        return max_

