 class Solution:
    def XXX(self, prices: List[int]) -> int:
        days=len(prices)
        if days==1:return 0
        max_p = 0   
        for i in range(days-1):
            for j in range(i,days):
                profit = prices[j]-prices[i] #利润等于卖出减去买入
                if max_p<profit:
                    max_p=profit
        if max_p>0:return max_p
        else: return 0 

