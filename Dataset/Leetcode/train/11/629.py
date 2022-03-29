 class Solution:
    def XXX(self, height: List[int]) -> int:
        head = 0
        tail = len(height)-1
        area = 0
        while head<tail:
            tmp_area = (tail-head)*min(height[head],height[tail])
            area = max(area,tmp_area)
            if height[head]<height[tail]:
                head+=1
            else:
                tail-=1
        return area

