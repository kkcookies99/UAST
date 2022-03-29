class Solution(object):
    def XXX(self, x):
        """
        :type x: int
        :rtype: int
        """
        # 思路：带些许优化的穷举
        if x == 0: return x
        else: i = 1
        while i * i < x: i *= 2
        if i * i == x: return i
        else: i /= 2
        while not (i * i == x or (i+1) * (i+1) > x): i += 1
        return i

