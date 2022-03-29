class Solution(object):
    def XXX(self, x):
        """
        :type x: int
        :rtype: int
        """
        left=0
        right=x+1
        while right-left>1:
            center=(left+right)/2
            if center*center<x:
                left=center
            elif center*center>x:
                right=center
            elif center*center==x:
                return center
        return min(left,right)

