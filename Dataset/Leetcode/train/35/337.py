 class Solution(object):
    def XXX(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        if target in nums:
            return nums.index(target)
        else:
            nums.append(target)
            nums = sorted(nums)
            return nums.index(target)

