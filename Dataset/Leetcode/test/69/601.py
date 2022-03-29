class Solution:
    def XXX(self, x: int) -> int:
        # root = 0
        # while (root * root <= x): root += 1
        # return root-1
        left, right = 0, x // 2 + 1
        mid = right // 2
        while left < right:
            pow_val = mid ** 2
            if pow_val == x: return mid
            elif pow_val > x:
                if (mid-1) ** 2 <= x: return mid - 1
                else:
                    right = mid
                    mid -= (right - left) // 2 or 1
            else:
                left = mid
                mid += (right - left) // 2 or 1
        return mid

