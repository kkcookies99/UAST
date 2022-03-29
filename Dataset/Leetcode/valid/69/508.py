class Solution:
    def XXX(self, x: int) -> int:
        if x == 1: return 1
        left = 0
        right = x
        while right > left and right - left != 1:
            mid = (left + right) // 2
            if mid * mid > x:
                right = mid
            else:
                left = mid
        return left

