 class Solution(object):
    def XXX(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        m = {}
        for i, a in enumerate(nums):
            if target-a in m:
                return m[target-a],i
            m[a] = i

