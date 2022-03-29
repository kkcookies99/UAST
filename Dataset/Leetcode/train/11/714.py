 class Solution:
    def XXX(self, height: List[int]) -> int:
        maxl = 0
        maxr = len(height) - 1
        left = maxl
        right = maxr
        maxq = (right - left) * min(height[left],height[right])
        while left < right :
            if height[maxl] < height[maxr]:
                while height[maxl] >= height[left] and left < right:
                    left = left + 1
                maxl = left
                maxq = max(((maxr - maxl) * min(height[maxl], height[maxr])),maxq)
            else:
                while height[maxr] >= height[right] and left < right:
                    right = right - 1
                maxr = right
                maxq = max(((maxr - maxl) * min(height[maxl], height[maxr])), maxq)

        return maxq

