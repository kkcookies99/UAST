 class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        nums.sort()
        for i in range(len(nums)//2):
            if nums[2*i] != nums[2*i+1]:return nums[2*i]
        return nums[-1]

