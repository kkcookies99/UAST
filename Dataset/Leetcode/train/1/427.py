 class Solution(object):
    def XXX(self, nums, target):
        for i in range(len(nums)-1):
            diff=target-nums[i]
            if diff in nums[i+1:]:
                return [i,nums[i+1:].index(diff)+i+1]

