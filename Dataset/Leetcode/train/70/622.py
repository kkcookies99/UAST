class Solution(object):
    def XXX(self, n):
        """
        :type n: int
        :rtype: int
        """
        return int(1/pow(5, 0.5)*(pow((1+pow(5, 0.5))/2, n+1)-pow((1-pow(5, 0.5))/2, n+1)))

