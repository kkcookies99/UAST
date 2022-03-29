class Solution(object):
    def XXX(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        maxa = 0
        if len(height) < 2:
            return 0
        i = 0
        j = len(height)-1
        while i < j:
            area = min(height[i], height[j])*(j-i)
            maxa = max(maxa, area)
            if height[i] <= height[j]:
                i+=1
            else:
                j-=1
        return maxa

