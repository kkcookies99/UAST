 class Solution(object):
    def XXX(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        n=len(height)
        left=0
        right=n-1
        res=0
        while left<right:
            res=max(res,min(height[left],height[right])*(right-left))
            if height[left]<=height[right]:
                left+=1
            else:
                right-=1    
        return res

