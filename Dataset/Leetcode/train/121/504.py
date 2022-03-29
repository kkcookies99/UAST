 class Solution:
    def XXX(self, prices: List[int]) -> int:
        a=prices[0]
        c=-1
        for i in prices:
            b=i-a
            if b<0:
                a=i
            else:
                c=max(c,b)
        return c if c>0 else 0

