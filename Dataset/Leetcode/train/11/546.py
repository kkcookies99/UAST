 class Solution:
    def XXX(self, height: List[int]) -> int:
        if len(height)<3:
            return min(height)
        
        acreage = 0
        i,j = 0,len(height)-1
        while i<j:
            a = min(height[i],height[j])*(j-i)
            acreage = max(a,acreage)
            if height[i]<height[j]:
                i+=1
            else:
                j-=1
        
        return acreage

