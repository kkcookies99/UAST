 class Solution:
    def XXX(self, height: List[int]) -> int:

        i = 0
        j = len(height)-1
        
        max_size = 0
        while i<j:
            size = (j-i)*min(height[i], height[j])
            if size > max_size:
                max_size = size
            
            if height[i]>height[j]:
                j -= 1
            else:
                i += 1
        
        return max_size

