 class Solution(object):
    def XXX(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        buf = set(nums)
        for i, v in enumerate(nums):
            if (target - v) in buf and i != nums.index(target - v):
                return [i, nums.index(target - v)]

