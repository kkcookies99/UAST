 class Solution(object):
    def XXX(self, nums, target):
        return [i for i in range(len(nums)) if (target-nums[i] in nums and nums[i]*2 != target) or (target-nums[i] in nums and nums.count(nums[i])>1)]

