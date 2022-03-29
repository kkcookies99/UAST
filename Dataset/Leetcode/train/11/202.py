class Solution:
    def XXX(self, height: List[int]) -> int:
        l, r = 0, len(height)-1
        ans = 0
        while l < r:
            area = min(height[l], height[r])*(r-l)
            ans = max(area, ans)
            if height[l] <= height[r]:
                l += 1
            else:
                r -= 1
        return ans

