class Solution:
    def XXX(self, height: List[int]) -> int:
        # 两边向内
        left,right=0,len(height)-1
        max=0
        while right>left:
            if (right-left)*min(height[left],height[right])>max:
                    max=(right-left)*min(height[left],height[right])
            if height[left]>=height[right]:
                right-=1
            else:
                left+=1
        return max

