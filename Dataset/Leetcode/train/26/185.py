 class Solution:
    def XXX(self, nums: [int]) -> int:
        i = 0
        while(i < len(nums) - 1 ):
            if nums[i] == nums[i + 1]:
                nums.pop(i)
            else:
                i += 1
        return len(nums)

