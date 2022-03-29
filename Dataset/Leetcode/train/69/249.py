class Solution(object):
    def XXX(self, x):
        """
        :type x: int
        :rtype: int
        """
        left = 0
        right = x
        if x == 1:
            return 1
        ans = 0
        while left < right:
            cut = (right+left)//2
            if (cut-1)**2 <= x < cut**2:
                ans = cut-1
                break
            elif cut**2 <= x < (cut+1)**2:
                ans = cut
                break
            elif (cut+1)**2 < x:
                left = cut
            elif (cut-1)**2 > x:
                right = cut
        return ans


