 class Solution(object):
    def XXX(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
        index = 0
        for i in xrange(len(nums)):
            if nums[i] != val:
                nums[i], nums[index] = nums[index], nums[i]
                index += 1
        return index

