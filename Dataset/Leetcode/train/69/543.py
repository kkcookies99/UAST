class Solution:
    def XXX(self, x: int) -> int:
        if x == 0 or x == 1:
            return x

        low = 1
        high = x
        while low <= high:
            can = int(low + (high - low)/2)
            if can*can > x:
                high = can - 1
            elif (can+1)*(can+1) <= x:
                low = can + 1
            else:
                return can

