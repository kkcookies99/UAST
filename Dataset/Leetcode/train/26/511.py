 class Solution(object):
    def XXX(self, nums):
        left = 0
        right = left+1
        while right<len(nums):
            while right<len(nums) and nums[left] == nums[right]:
                nums.remove(nums[right])
            left = right
            right = left + 1
        return len(nums)

