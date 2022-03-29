 class Solution:
    def XXX(self, height: List[int]) -> int:
        i, j, ans = 0, len(height) - 1, 0
        while i < j:
            if height[i] <= height[j]:
                ans = max(height[i] * (j - i), ans)
                i += 1
            else:
                ans = max(height[j] * (j - i), ans)
                j -= 1
        return ans

