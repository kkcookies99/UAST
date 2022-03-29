 class Solution(object):
    def XXX(self, x):
        """
        :type x: int
        :rtype: int
        """
        rev = int(str(abs(x))[::-1])
        sign = 1 if x>0 else -1
        return sign * rev if -2**31 < rev < 2**31-1 else 0

