class Solution(object):
    def XXX(self, x):
        """
        :type x: int
        :rtype: int
        """
        if x > 0:
            xstr = str(x)
            xstr = xstr[::-1]
            x = int(xstr)
        else:
            xstr = str(-1*x)
            xstr = xstr[::-1]
            x = -1*int(xstr)
        
        if x > 2**31-1 or x < -2**31:
            return 0
        return x

