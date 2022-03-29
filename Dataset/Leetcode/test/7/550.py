 class Solution(object):
    def XXX(self, x):
        """
        :type x: int
        :rtype: int
        """
        a = []
        b = ''
        if x < 0:
            ran = -x
        else:
            ran = x
        for i in str(ran):
            a.append(i)
        for j in range(1, len(a) + 1):
            b = b + a[-j]
        b=int(b)
        if b>2147483649:
            return 0
        if x < 0:
            b = -b
        return b

