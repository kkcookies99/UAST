 class Solution(object):
    def XXX(self, x):
        """
        :type x: int
        :rtype: int
        """
        if x < 0: return -1*self.XXX(-x)
        res = 0
        while x >= 10:
            res = res*10+x%10
            x = x//10
        
        if x: res = res*10+x
        
        if res > 2**31-1: return 0
        return res

