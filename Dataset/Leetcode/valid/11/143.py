class Solution(object):
    def XXX(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        # 思路1：寻找每对线段的面积，找最大值，时间复杂度O(n^2),超时
        # max_area = 0
        # for i in range(len(height)):
        #     for j in range(1, len(height)):
        #         max_area = max(min(height[i], height[j])*(j-i), max_area)
        # return max_area
    
        # 思路2：双指针法,从计算最外围一对线段开始向内，左右指针向较高的线段方向移动
        left, right = 0, len(height)-1
        max_area = 0
        for i in range(len(height)):
            max_area = max(min(height[left], height[right])*(right-left), max_area)
            if height[left] < height[right]:
                left += 1
            else:
                right -= 1
        return max_area

