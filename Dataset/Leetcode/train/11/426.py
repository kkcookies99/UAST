 class Solution:
    def XXX(self, height: List[int]) -> int:
        left = 0
        right = len(height)-1
        max_area = 0
        while right != left:
            if height[left] <= height[right]:
                if max_area < height[left] * (right - left):
                    max_area = height[left] * (right - left)
                left += 1
            else:
                if max_area < height[right] * (right - left):
                    max_area = height[right] * (right - left)
                right -= 1
        return max_area

