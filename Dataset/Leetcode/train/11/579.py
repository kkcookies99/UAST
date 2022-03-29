 class Solution:
    def XXX(self, height: List[int]) -> int:
        ans = -1
        i,j = 0,len(height)-1
        while i<j:
            s = min(height[i],height[j])*(j-i)
            if s > ans:
                ans = s
            if height[i]<height[j]:
                i += 1
            else:
                j -= 1
        return ans
        

