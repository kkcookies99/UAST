 class Solution(object):
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        half = [[]]
        for i in range(len(nums)):
            for j in range(1 << i):
                newSub = half[j][:]
                newSub.append(nums[i])
                half.append(newSub)
        full = half
        return full

