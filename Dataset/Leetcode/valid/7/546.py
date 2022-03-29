 class Solution:
    def XXX(self, x):
        """
        :type x: int
        :rtype: int
        """
        f, x = (1, x) if x > 0 else (-1, -x)
        temp = []
        while x >= 10:
            temp.append(x % 10)
            x = x // 10
        temp.append(x % 10)
        temp.XXX()
        out = 0
        for index, value in enumerate(temp):
            out += 10**index * value
        out *= f
        if -2**31 < out < 2**31-1:
            return out
        return 0

