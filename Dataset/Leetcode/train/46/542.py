 class Solution(object):
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        res = [[]]
        i = len(nums)
        while i > 0:
            res = [a+[b] for a in res for b in nums]
            i -= 1
        output = [x for x in res if sorted(x) == sorted(nums)]
        return output

