class Solution:
    def XXX(self, x: int) -> int:
        left, right = 0, x
        while(1):
            mid = left + (right - left) // 2
            if(mid * mid == x):
                return mid
            elif(mid * mid > x):
                right = mid
            else:
                left = mid + 1
                if(left * left > x):
                    return mid

