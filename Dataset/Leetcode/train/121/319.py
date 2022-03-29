 class Solution:
    def XXX(self, prices: List[int]) -> int:
        start=prices[0]
        money=0
        
        for i in range(len(prices)):
            if start>=prices[i]:
                start=prices[i]
            else:
                money=max(money,prices[i]-start)

        return money

