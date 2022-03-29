 class Solution:
    def XXX(self, prices: List[int]) -> int:
        max_val = 0
        buy, sell = None, None
        for i in prices:
            if buy is None or buy > i:
                buy = i
                sell = None
            elif (buy is not None and sell is None) or (sell is not None and sell < i):
                sell = i
                max_val = max(max_val, sell - buy)
            else:
                continue
        return max_val

