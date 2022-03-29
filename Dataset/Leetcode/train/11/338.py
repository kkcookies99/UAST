class Solution(object):
    def XXX(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        l, r = 0, len(height) - 1
        XXX = 0 

        while l < r:
            XXX = max(XXX, (r-l) * min(height[l], height[r]))
            if height[l] < height[r]:
                l += 1
            else:
                r -= 1
        return XXX

