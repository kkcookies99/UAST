 class Solution:
    def XXX(self, prices: List[int]) -> int:
        profit = 0
        min_p = prices[0]
        for i in range(len(prices)-1):
            if prices[i+1]<prices[i]:
                min_p = min(min_p,prices[i+1])
            else:
                profit = max(profit,prices[i+1]-min_p)
        return profit

