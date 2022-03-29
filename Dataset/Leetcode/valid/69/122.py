class Solution:
    def XXX(self, x: int) -> int:
        ans = 0
        if x <= 1:
            return x
        left, right = 1, x
        while left <= right:
            mid = left + ((right - left) >> 1)
            if mid <= x / mid:
                left = mid + 1
                ans = mid
            else:
                right = mid - 1
        return ans

