 class Solution:
    def XXX(self, nums: List[int], target: int) -> List[int]:
        x=dict()
        for i in range(len(nums)):
            if target-nums[i] in x:
                return [i,x[target-nums[i]]]
            else:
                x[nums[i]]=i 

