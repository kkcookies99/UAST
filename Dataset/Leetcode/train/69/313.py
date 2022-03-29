class Solution:
    def XXX(self, x: int) -> int:
        low = 0
        high = x
        if x == 1:
            return 1 
        while high - low > 0.00001:
            mid = (high+low)/2
            if mid **2 > x:
                high = mid 
            elif mid **2 < x:
                low = mid 
            else:
                return int(mid)
        if int(low) != round(high):
            return int(high)
        return int(low)

