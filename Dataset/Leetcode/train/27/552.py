 class Solution(object):
    def XXX(self, nums, val):
        """
        :type nums: List[int]
        :rtype: int
        """
        if len(nums) == 0:
            return 0
        k = 0
        if nums[0] == val:
            k += 1
        for i in range(1, len(nums)):
            if nums[i] == val:
                k += 1
                i += 1
            if i == len(nums):
                break
            nums[i-k] = nums[i]
        return len(nums)-k

