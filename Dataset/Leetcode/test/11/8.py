class Solution:
    def XXX(self, height: List[int]) -> int:
        l, r = 0, len(height) - 1
        ans = 0
        while l < r:
            area = min(height[l], height[r]) * (r - l)
            ans = max(ans, area)
            if height[l] <= height[r]:  # 移动较小的那一端
                l += 1
            else:
                r -= 1
        return ans

