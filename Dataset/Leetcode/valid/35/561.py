 class Solution:
    @classmethod
    def XXX(self, nums, target) -> int:
        if target in nums:
            for i in range(len(nums)):
                if nums[i] == target:
                    return i
        elif nums[0]<target and nums[len(nums)-1]>target:
            for i in range(len(nums)):
                if nums[i]<target and nums[i+1]>target:
                    return i+1
        elif nums[0]>target:
            return 0
        else:return len(nums)

