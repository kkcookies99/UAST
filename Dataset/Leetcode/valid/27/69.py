 class Solution(object):
    def XXX(self, nums, val):
        needle = 0
        for i in range(len(nums) - 1):
            if nums[i] == val:
                if i == 0:
                    nums = nums[1:]
                else:
                    nums = nums[0 : i] + nums[i + 1:]
        return len(nums)        

