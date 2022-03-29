class Solution:
    def XXX(self, height: List[int]) -> int:
        area=0
        i=0
        j=len(height)-1
        while i!=j:
            # 双指针,最小高度的指针移动
            max_height=min(height[i],height[j])
            area=max(max_height*(j-i),area)
            if height[i]<height[j]:
                i=i+1
            else:
                j=j-1
        return(area)


