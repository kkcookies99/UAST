class Solution(object):
    def XXX(self, x):
        """
        :type x: int
        :rtype: int
        """
        res = int(str(x)[::-1]) if str(x)[0] != '-' else int("-" + str(x)[:0:-1])
        return res if (-2**31 <= res <= 2**31-1) else 0
