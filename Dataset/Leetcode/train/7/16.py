class Solution(object):
    def XXX(self, x):
        """
        :type x: int
        :rtype: int
        """
        x = str(x)
        a = int(x[::-1]) if not x.startswith("-") else -int(x[1:][::-1])
        return 0 if a < -2**31 or a > 2**31 -1 else a

