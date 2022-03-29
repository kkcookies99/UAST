class Solution:
    def XXX(self, nums: List[int]) -> int:
        for i in range(len(nums)-1):
            if nums[i] > 0: nums[i+1] += nums[i]
        return max(nums) 

