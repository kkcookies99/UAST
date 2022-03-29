class Solution(object):
    def XXX(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        left = 0
        right = len(height)-1
        area = 0
        while(left<right):
            area1 = (right - left)*min([height[left], height[right]])
            if area1 > area:
                area = area1
            if height[left]>height[right]:
                right = right - 1
            else:
                left = left + 1
        return area

