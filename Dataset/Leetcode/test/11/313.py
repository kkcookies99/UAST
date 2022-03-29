class Solution:
    def XXX(self, height: List[int]) -> int:    
        左=0
        右=len(height)-1
        值=0
        while 左<右:                     
            面值=min(height[左],height[右])*(右-左)
            值=max(值,面值)
            if height[左]<=height[右]:
                左+=1
            else:
                右-=1
        return  值

