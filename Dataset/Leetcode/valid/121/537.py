 class Solution:
    def XXX(self, prices: List[int]) -> int:
        min_i = 0
        max_i = 0
        benifit = 0
        for i in range(1, len(prices)):
            if prices[i] > prices[max_i]:
                max_i = i
                benifit = max(benifit, prices[max_i] - prices[min_i])
            elif prices[i] < prices[min_i]:
                min_i = i
                max_i = i
        return benifit

