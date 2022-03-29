class Solution:
    def XXX(self, height: List[int]) -> int:
        l, r = 0, len(height)-1
        ans = min(height[l], height[r]) * r
        while l < r:
            area = (r-l) * min(height[l], height[r])
            if height[l] <= height[r]:
                l += 1
            elif height[l] > height[r]:
                r -= 1
            ans = max(ans,area)
        return ans

