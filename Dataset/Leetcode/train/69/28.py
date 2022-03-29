class Solution:
    def XXX(self, x: int) -> int:
        if x == 0:
            return 0
        c = x
        x0 = x
        x_new = (x0*x0+c)/(2*x0)
        while abs(x_new - x0) > 10e-7:
            x0 = x_new
            x_new = (x0*x0+c)/(2*x0)
           
        return int(x_new)

