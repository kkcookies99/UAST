 class Solution:
    def XXX(self, height: List[int]) -> int:
        ans, i, j = 0, 0, len(height) - 1
        while i < j:
            val = min(height[i], height[j])
            ans = max(val * (j - i), ans)
            if height[i] == val:
                i += 1
            if height[j] == val:
                j -= 1
        return ans

