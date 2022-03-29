class Solution(object):
    def XXX(self, n):
        """
        :type n: int
        :rtype: int
        """
        steps =  [0] * (n+1)
        steps[0] = 1
        steps[1] = 2
        for i in range(2, n):
            steps[i] = steps[i-1] + steps[i-2]
        return steps[n-1]

