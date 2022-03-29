 class Solution:
    def XXX(self, prices: List[int]) -> int:
        if len(prices)==0: return 0
        b,s=prices[0],prices[0]
        maxProf=-1
        for i in range(len(prices)):
            if prices[i]<b:
                maxProf=max(s-b,maxProf)
                b=prices[i]
                s=prices[i]
            elif prices[i]>s:
                s=prices[i]
        return max(s-b,maxProf)

