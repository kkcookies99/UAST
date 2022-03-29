 class Solution:
    def XXX(self, nums: List[int], target: int) -> List[int]:
        i=0
        
        while i<len(nums):
            goal=target-nums[i]
            try:
                goal_index=nums[i+1:].index(goal)
                return [i,goal_index+i+1]
            except:
                i+=1
                

