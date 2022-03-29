 class Solution:
    def XXX(self, height: List[int]) -> int:
        left = 0
        right = len(height)-1
        ret = 0
        while left != right:
            if height[left] > height[right]:
                bei = height[right]*(right-left)
                if bei > ret:ret = bei
                right -= 1
            else:
                bei = height[left]*(right-left)
                if bei > ret:ret = bei
                left += 1
        return ret

