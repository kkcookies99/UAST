 class Solution:
    def XXX(self, prices: List[int]) -> int:
        if not prices:
            return 0
        mi=prices[0]
        ma=0
        for p in prices[1:]:
            mi=min(p,mi)
            ma=max(ma,p-mi)
        return ma

