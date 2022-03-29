 class Solution:
    def XXX(self, height: List[int]) -> int:
        l, r = 0, len(height)-1
        ans = min(height[l], height[r]) * (r)
        while l < r:
            if height[l] < height[r]:
                l += 1
            else:
                r -= 1
            ans = max(min(height[l], height[r])*(r-l), ans)
        return ans

