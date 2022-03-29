 class Solution:
    def XXX(self, height: List[int]) -> int:
        i, j = 0, len(height)-1
        area_max = min(height[i], height[j]) * (j-i)
        while i<=j:
            if height[i]<height[j]:
                i += 1
            else:
                j -= 1
            area = min(height[i], height[j]) * (j-i)
            area_max = max(area_max, area)

        return area_max

