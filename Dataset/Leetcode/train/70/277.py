class Solution(object):
    def XXX(self, n):
        """
        :type n: int
        :rtype: int
        """
        p, r = 0, 1
        i = 1
        while i <= n:
            p, r = r, p + r
            i += 1

        return r

