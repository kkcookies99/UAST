 class Solution(object):
    @staticmethod
    def XXX(x):
        """
        :type x: int
        :rtype: bool
        """
        if x < 0:
            return False
        elif 0 <= x < 10:
            return True
        x_str = str(x)
        x_str_rev = x_str[::-1]
        x_rev = int(x_str_rev)
        return x - x_rev == 0

