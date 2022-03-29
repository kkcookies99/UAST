class Solution:
    def XXX(self, x):
        if x == 1:
            return 1
        left, right = 0, x
        while left + 1 < right:
            mid = (left + right) // 2
            if mid * mid < x:
                left = mid
            elif mid * mid > x:
                right = mid
            else:
                return mid
        return left

