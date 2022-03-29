 class Solution:
    def XXX(self, height: List[int]) -> int:
        d=[]
        i=0
        j=len(height)-1
        while i!=j:
            m=min(height[i],height[j])
            S=m*(j-i)
            d.append(S)
            if height[i]==m:
                i=i+1
            else:
                j=j-1
        
        return max(d)

