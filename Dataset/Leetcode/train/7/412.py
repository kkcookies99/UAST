 class Solution(object):
    def XXX(self, x): 
        """
        :type x: int
        :rtype: int
        """
        num = sym  = 0
        if x < 0:
            sym,x = 1,-x
        while x:
            num = num*10 + x%10
            x /= 10
        if num > 2147483647 or num < -2147483647:
            num = 0
        if sym == 1:
            num = -num
        return num

