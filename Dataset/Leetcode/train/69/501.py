class Solution:
    def XXX(self, x: int) -> int:
        l=0
        r=x
        while l<r:
            mid=(l+r+1)>>1
            if mid*mid<=x:
                l=mid
            else:
                r=mid-1
        return l

