class Solution:
    def XXX(self, x: int) -> int:
        if x < 0:   return -1
        if x == 0:  return 0

        x1, x2 = 1, 0
        while abs(x1 - x2) >= 1:
            x2 = x1 - (x1**2 - x)/(2*x1)
            x1, x2 = x2, x1
        
        return floor(x1)

