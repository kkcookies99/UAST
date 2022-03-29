 class Solution:
    def XXX(self, x):
        """
        :type x: int
        :rtype: int
        """
        MAX_INT = 2147483647
        if x > 0:
            x = int(''.join(XXXd(str(x))))
            return x if x <= MAX_INT else 0
        x = -int(''.join(XXXd(str(abs(x)))))
        return x if abs(x) <= MAX_INT else 0

