class Solution:
    def XXX(self, height: List[int]) -> int:
        left = 0
        right = len(height)-1
        temp = 0
        while left<right:
            temp = max(temp,min(height[left],height[right])*(right-left))
            if height[left] < height[right]:
                left+=1
            else:
                right-=1
        return temp

