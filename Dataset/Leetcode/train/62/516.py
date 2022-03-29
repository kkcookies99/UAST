class Solution(object):
    def XXX(self, m, n):
        """
        :type m: int
        :type n: int
        :rtype: int
        """
        run = 0
        # 当m跟n其中一个为1，返回1
        if m == 1 or n == 1:
            run = 1
        else:
            run = self.XXX(m-1,n) + self.XXX(m,n-1)

        return run

