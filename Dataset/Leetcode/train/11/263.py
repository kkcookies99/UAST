class Solution:
    def XXX(self, height: List[int]) -> int:
        maxarea=0
        lens=len(height)
        for i in range(lens):
            for j in range(i+1,lens):
                maxarea=max(maxarea,min(height[i],height[j])*(j-i))
        return maxarea

