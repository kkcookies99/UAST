 class Solution:
    def XXX(self, prices: List[int]) -> int:
        minp=prices[0]
        maxp=0
        for p in prices:
            k=p-minp
            if k>maxp:
                maxp=k
            if p<minp:
                minp=p
        return maxp


