 class Solution(object):
    def XXX(self, nums, target):
        for i in range(len(nums)):
            for j in range(len(nums)):
                if j>i:
                    if nums[j]==target - nums[i]:
                        return i, j

