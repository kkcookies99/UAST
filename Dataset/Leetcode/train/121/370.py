 class Solution:
    def XXX(self, prices: List[int]) -> int:
        # steps calculate the difference between values and store the smalller one
        #for next comparison
        dp = []
        if len(prices) == 1:
            return 0
        for i in range(0,len(prices)-1):
            a = min(prices[i] - prices[i+1],0)#means the length of prices need to 
            #greater than or equal to 2
            dp.append(a)
            prices[i+1] = min(prices[i],prices[i+1])
        return abs(min(dp))

