class Solution(object):
    def XXX(self, x):
        """
        :type x: int
        :rtype: bool
        """
        x = str(x)
        len_x = len(x)
        if len_x <= 1:
            return True
        return x == x[::-1]

