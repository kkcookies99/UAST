class Solution(object):
    def XXX(self, n):
        """
        :type n: int
        :rtype: int
        """
        
        if n == 1:
            return 1
        elif n == 2:
            return 2
        a, b = 1, 2
        for i in range(2, n):
            a, b = b, a + b

        return b

