class Solution(object):
    def XXX(self, x):
        """
        :type x: int
        :rtype: int
        """
        if x==0:
            return 0
        x = (x//abs(x)) * int(str(abs(x))[::-1])
        if -2 ** 31 < x < 2 ** 31 - 1:
            return x
        return 0

