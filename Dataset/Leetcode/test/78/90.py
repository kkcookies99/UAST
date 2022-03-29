class Solution(object):
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        half = [[]]
        for i in range(len(nums)):
            for j in range(1 << i):
                half.append( half[j] + [nums[i]] )
        full = half
        return full

