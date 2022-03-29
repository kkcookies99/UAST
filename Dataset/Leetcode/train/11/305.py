class Solution:
    def XXX(self, height: List[int]) -> int:
        s = 0
        e = len(height) - 1
        max_area = min(height[s], height[e]) * (e - s)
        while e > s:
            h_left, h_right = height[s], height[e]
            if h_left > h_right:
                e -= 1
            else:
                s+=1
            area = min(height[s], height[e]) * (e - s)
            if area>max_area:
                max_area = area
        return max_area

