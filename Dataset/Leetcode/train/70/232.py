class Solution(object):
    def XXX(self, n):
        """
        :type n: int
        :rtype: int
        """
        if n <= 3 :return n
        test = [0, 1, 2, 3]
        for i in range(n - 3):test.append(test[-1]+test[-2])
        return test[-1]

