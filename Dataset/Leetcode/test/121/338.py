 class Solution:
    def XXX(self, prices: List[int]) -> int:
        max_p = 0
        min_p = prices[0]
        if len(prices) <  2:
            return 0
        else:
            for i in range(1,len(prices)):
                max_p = max(max_p, prices[i]-min_p)
                min_p = min(min_p, prices[i])
            return max_p

