 class Solution:
    def XXX(self, x: int) -> int:
        if x >= -2**31 and x < 2**31 -1:
            if abs(x) == x:
                x1 = str(x)
                y1 = x1[::-1]
                y = int(y1)
                if y >= 2**31-1:
                    return 0
                else:
                    return y
            else:
                x1 = abs(x)
                x2 = str(x1)
                y1 = x2[::-1]
                y = -abs(int(y1))
                if -y >= 2**31-1:
                    return 0
                else:
                    return y
        else: 
            return 0

