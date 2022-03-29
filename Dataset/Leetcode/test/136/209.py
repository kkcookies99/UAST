 class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        
        for index in range(len(nums)):
            if nums.count(nums[index]) == 1:
                return nums[index]
        return -1
