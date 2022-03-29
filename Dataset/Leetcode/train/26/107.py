 class Solution(object):
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        import numpy as np 
        nums = list(np.unique(nums))
        return len(nums)

