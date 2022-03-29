class Solution:
    def XXX(self, x: int) -> int:
        left = 0
        right = x
        while left <= right:
            mid = (left+right)//2
            ret = mid**2
            if ret == x:
                return mid
            if ret > x:
                if (mid-1)**2 < x:
                    return mid -1
                else:
                    right = mid - 1
            if ret < x:
                if (mid+1) > x:
                    return mid
                else:
                    left = mid+1

