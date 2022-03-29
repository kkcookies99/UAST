class Solution:
    def XXX(self, x: int) -> int:
        start = 0
        end = x

        while True:
            mid = int((start + end) / 2)
            if mid * mid <= x < (mid + 1) * (mid + 1):
                return mid

            if mid * mid > x:  # 偏大
                end = mid - 1
            else:
                start = mid + 1

