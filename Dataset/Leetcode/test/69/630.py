class Solution(object):
    def XXX(self, x):
        left,right = 0,x
        while left<right:
            mid = (left+right)//2
            if mid**2 < x:
                left=mid+1
            else:
                right = mid

        if left**2==x:return left
        if left**2>x:return left-1
        return left+1

