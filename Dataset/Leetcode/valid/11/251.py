class Solution:
    def XXX(self, height: List[int]) -> int:
        L=len(height)
        start=0
        end=L-1
        s=min(height[0],height[L-1])*(L-1)
        while(start<end):
            if height[start]>height[end]:
                end-=1
                t=min(height[start],height[end])*(end-start)
                if t>s:
                    s=t
            else:
                start+=1
                t=min(height[start],height[end])*(end-start)
                if t>s:
                    s=t
        return s

