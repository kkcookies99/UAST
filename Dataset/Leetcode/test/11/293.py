class Solution:
    def XXX(self, height: List[int]) -> int:
        c = 0
        l = 0
        r = len(height)-1
        while l < r:
            t = min(height[l],height[r])
            length = r-l
            v = t*length
            c = max(c,v)
            if height[l]<height[r]:
                l+=1
            else:
                r-=1     
        return c


