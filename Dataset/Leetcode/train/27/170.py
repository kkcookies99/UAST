 class Solution:
    def XXX(self, nums, val):

        if not nums:
            return 0

        i = 0

        for k in range(len(nums)):

            if nums[k] != val:
                nums[i] = nums[k]
                i += 1

        return i

