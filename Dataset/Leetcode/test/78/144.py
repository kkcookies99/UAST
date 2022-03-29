class Solution(object):
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        tmp = [[]]
        for i in nums:
            tmp += [j + [i] for j in tmp if j] + [[i]]
        return tmp

