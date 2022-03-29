 class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        nums.sort()
        while len(nums) > 1 and nums[0] == nums[1]:
            nums = nums[2:]
        else:
            return nums[0]

