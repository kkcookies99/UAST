 class Solution:
    def XXX(self, prices: List[int]) -> int:
        a=prices[0]
        b=0
        for i in range(len(prices)):
            b=max(b,prices[i]-a)
            a=min(a,prices[i])
        return b

