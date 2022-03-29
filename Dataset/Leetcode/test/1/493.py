 class Solution:
    def XXX(self, nums: List[int], target: int) -> List[int]:
        
        for i in range(len(nums)):
            temp = target - nums[i]
            nums[i] = None
            if temp in nums:
                return [i,nums.index(temp)]

