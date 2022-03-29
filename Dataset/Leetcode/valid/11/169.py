class Solution:
    def XXX(self, height: List[int]) -> int:
        length = len(height)
        left_ = 0
        right_ = length - 1
        area = 0
        while left_ < right_:
            sum = min(height[left_], height[right_]) * (length - 1)
            area = max(area, sum)
            length -= 1
            if height[left_] <= height[right_]:
                left_ += 1
            else:
                right_ -= 1
        return area

