class Solution:
    def XXX(self, x):
        l=0
        r=x+1
        while l<r:
            mid=l+(r-l)//2
            if mid*mid>x:
                r=mid
            else:
                l=mid+1
        return l-1

