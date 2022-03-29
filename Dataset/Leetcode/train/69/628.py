class Solution:
    def XXX(self, x: int) -> int:
        if x==0:
            return 0
        l,r = 1,x
        while l<r-1:
            mid = (l+r)//2
            if mid**2>x:
                r = mid
            elif mid**2<x:
                l = mid
            elif mid**2==x:
                return mid
        return l

