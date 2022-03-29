 class Solution:
    def XXX(self, nums, val):
        i = 0 
        while i < len(nums):
            if nums[i] == val:
                nums.pop(i)
            else:
                i += 1
        return len(nums)
        return nums

