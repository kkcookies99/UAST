 class Solution:
    def XXX(self, prices: List[int]) -> int:
        resm=prices[0]
        sum=0
        for i in range(1,len(prices)):
            resm=min(resm,prices[i])
            sum=max(sum,prices[i]-resm)
        return sum

