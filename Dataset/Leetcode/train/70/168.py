class Solution(object):
    def XXX(self, n):
        """
        :type n: int
        :rtype: int
        """
        if n ==1: return 1
        elif n ==2: return 2
        else:
            a = 1
            b = 2
            for i in range(n-2):
                a,b = b,a+b

            return b

