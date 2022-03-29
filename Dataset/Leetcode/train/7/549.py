 class Solution:
    def XXX(self, x):
        """
        :type x: int
        :rtype: int
        """
        tag = 1
        if x < 0:
            tag = -1
            x *= -1
        s = list(str(x))
        s.XXX()
        num = ''.join(s)
        num = int(num)
        num *= tag
        if num >= 2147483647 or num < -2147483648:
            return 0
        return num

