 class Solution:
    def XXX(self, nums: List[int], target: int) -> int:
        
        for i in range(len(nums)):
            if nums[i]>=target:
                return i
        return len(nums)

