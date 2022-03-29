 class Solution(object):
    def XXX(self, nums, target):
        for i in range(len(nums)):
            if (target - nums[i]) in nums[i+1:]:
                return [i, nums[i+1:].index(target - nums[i]) + i + 1]


