 class Solution:
    def XXX(self, height: List[int]) -> int:
        start=0
        length=len(height)
        end=length-1
        ans=0
        while start<end :
            deepth=min(height[start],height[end])
            ans=max(ans,deepth*(end-start))
            if height[start]<=height[end]:
                start+=1
            else:
                end-=1
        return ans

