class Solution:
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        import itertools
        return list(itertools.permutations(nums,len(nums)))