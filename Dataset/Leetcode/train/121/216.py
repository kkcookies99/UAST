 class Solution:
    def XXX(self, prices: List[int]) -> int:
        max_profit = 0
        
        pre_p = prices[0]
        for j in range(len(prices)):
            max_profit = max(prices[j]-pre_p,max_profit)
            pre_p = min(pre_p,prices[j])
        return max_profit

