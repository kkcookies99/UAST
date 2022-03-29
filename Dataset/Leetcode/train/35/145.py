 class Solution:
    def XXX(self, nums, target):
        num = len(nums)
        s = 0
        while s < num:
            if nums[s] >= target:
                return s
            s += 1
        return num

