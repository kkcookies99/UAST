 class Solution:
    def XXX(self, nums, target):
        for i in range(len(nums) - 1):
            base = nums[i]
            for j in range(i + 1, len(nums)):
                if base + nums[j] == target:
                    return [i, j]

