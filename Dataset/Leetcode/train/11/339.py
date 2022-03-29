class Solution:
    def XXX(self, height: List[int]) -> int:
        n = len(height)
        i, j = 0, n - 1
        ans = 0
        while i < j:
            ans = max(ans, min(height[i], height[j]) * (j - i))
            if height[i] < height[j]:
                i += 1
            else:
                j -= 1

        return ans

