 class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        nums[:] = sorted(nums,key=nums.count)
        return nums[0]

