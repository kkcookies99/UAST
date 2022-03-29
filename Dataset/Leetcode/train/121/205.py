 class Solution:
    def XXX(self, prices: List[int]) -> int:
            
        for i in reversed(range(len(prices)-1)):
            if i == len(prices)-2:
                prices[i+1] = prices[i+1]-prices[i]
            else:
                prices[i+1] = prices[i+1]-prices[i] + max(prices[i+2],0)
        prices[0] = 0
        
        return max(prices)

