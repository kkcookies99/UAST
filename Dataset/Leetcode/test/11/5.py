class Solution(object):
    def XXX(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        left = 0
        right = len(height) - 1
        XXX = 0
        while left < right:
            b = right - left
            if height[left] < height[right]:
                h = height[left]
                left += 1
            else:
                h = height[right]
                right -= 1
            area = b*h
            if XXX < area:
                XXX = area
        return XXX

