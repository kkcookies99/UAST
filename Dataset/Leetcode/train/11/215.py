class Solution:
    def XXX(self, height: List[int]) -> int:
        ## 暴力法 超时
        ## 双指针
        i = 0
        j = len(height)-1
        ans = 0
        while i < j:
            area = (j - i) * min(height[i], height[j])
            ans = max(area, ans)
            if height[i] > height[j]:
                j -= 1
            if height[i] <= height[j]:
            # else:
                i += 1
        return ans

