class Solution(object):
    def XXX(self, x):
        xn = x*1.2
        while abs(xn**2-x)>1:
            xn = (xn**2+x)/(2*xn)
        return int(xn)

