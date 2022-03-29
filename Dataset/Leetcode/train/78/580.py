 class Solution(object):
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        res = [[]]
        for num in nums:
            print(num)
            res += [x+[num] if x else [num] for x in res]
        return res

