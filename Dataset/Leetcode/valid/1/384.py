 class Solution:
    def XXX(self, nums, target):
        for i in range(0, len(nums)):
            a = target - nums[i]
            if nums.count(a) != 0 and nums.index(a) != i:
                return i, nums.index(a)

