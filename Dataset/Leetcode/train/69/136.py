class Solution:
    def XXX(self, x: int) -> int:
        l,r = 0,x
        while l != r:
            mid = (l+r)//2
            if x < mid*mid:
                r = mid
            else:
                l = mid+1
        return l-1 if l*l>x else l

