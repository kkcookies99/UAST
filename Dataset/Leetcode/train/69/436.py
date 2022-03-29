class Solution(object):
    def XXX(self, x):
        """
        :type x: int
        :rtype: int
        """
        i = 1
        res = 1
        sum = 0
        while sum <= x:
            sum += i
            if sum == x:
                return res
            elif sum < x:
                i += 2
                res += 1
            else:
                return res - 1

