class Solution:
    def XXX(self, x: int) -> int:
        
        xn = x
        while (xn*xn - x) >= 1:
            xn = xn - (xn*xn-x) / (2*xn)
            
        return int(xn)

