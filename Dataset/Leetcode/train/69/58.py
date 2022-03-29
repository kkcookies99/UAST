class Solution:
    def XXX(self, x: int) -> int:
        left,right=0,x
        if x<=1: return x
        while left<right:
            mid=left+(right-left)//2
            if int(mid*mid)==x:
                return int(mid)
            if mid*mid>x:
                right=mid
            if mid*mid<x:
                left=mid
            if mid*mid<x and (mid+1)*(mid+1)>x:
                return int(mid)