 class Solution:
    def XXX(self, height: List[int]) -> int:
        ans = 0
        i , j = 0, len(height) - 1
        while(True):
            if j <= i:
                break
            ans = max(ans,   min(height[i], height[j]) * (j - i))
            if height[i] > height[j]: j -= 1
            else: i += 1
        
        return ans

