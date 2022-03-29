class Solution:
    def XXX(self, height: List[int]) -> int:
        # 此方法超时
        # max_area = 0
        # for i, h in enumerate(height):
        #     for j in range(i+1, len(height)):
        #         tmp_area = (j-i) * min(height[i], height[j])
        #         max_area = max(max_area, tmp_area)
        # return max_area
        
        # 双指针算法
        left = 0
        right = len(height) - 1
        max_area = 0
        while left < right:
            tmp_area = min(height[right], height[left]) * (right - left)
            max_area = max(tmp_area, max_area)

            # 比较左右边界，高度较小的往中间移动
            if height[left] < height[right]:
                left += 1
            else:
                right -= 1
        return max_area


