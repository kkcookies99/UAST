 class Solution(object):
    def XXX(self, x):
        """
        :type x: int
        :rtype: bool
        """
        sx = str(x)
        return cmp(sx[::-1], sx) == 0

