class Solution:
    def XXX(self, x: int) -> int:
        if x == 0 or x == 1:
            return x
        low, high = 1, x
        while int(low) < int(high):
            mid = (low + high) / 2
            if mid**2 == x:
                return int(mid)
            elif mid**2 > x:
                high = mid
            else:
                low = mid
        return int(mid)

