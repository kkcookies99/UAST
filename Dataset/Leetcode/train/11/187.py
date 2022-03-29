class Solution:
    def XXX(self, height: List[int]) -> int:
        n = len(height)
        left = 0
        right = n-1
        v = 0
        while left != right:
            m = min(height[left],height[right])*(right-left)
            v = max(m,v)
            if height[left]<=height[right]:
                left = left + 1 
                if left == right:
                    break
            elif height[right]<height[left]:
                right = right - 1
                if left == right:
                    break 
        return v

