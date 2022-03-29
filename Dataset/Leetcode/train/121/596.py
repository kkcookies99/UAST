 class Solution:
    def XXX(self, prices: List[int]) -> int:
        min_price = max(prices)
        max_pro = 0
        for p in prices:
            if p < min_price:
                min_price = p
            elif p - min_price > max_pro:
                max_pro = p - min_price
        return max_pro

