 class Solution:
    
    def XXX(self, prices: List[int]) -> int:
        pre_min_p = prices[0]
        profit = 0 
        for p in prices:
            new_profit = p - pre_min_p
            if new_profit > profit:
                profit = new_profit

            if p < pre_min_p:
                pre_min_p = p
            
        return profit

