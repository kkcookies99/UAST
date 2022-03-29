 class Solution:
    def XXX(self, height: List[int]) -> int:
        left_point = 0
        right_point = len(height) - 1
        area_max = (right_point - left_point)*min(height[left_point],height[right_point])
        while right_point > left_point:
            if height[left_point] > height[right_point]:
                right_point -= 1
            else:
                left_point += 1
            area = (right_point - left_point) * min(height[left_point], height[right_point])
            area_max = max(area, area_max)
        return area_max

