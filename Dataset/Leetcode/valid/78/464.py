 class Solution(object):
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        def helper(n, k, ls):
            if len(ls) == k:
                out.append(ls[:])
                return
            for i in range(n, len(nums)):
                ls.append(nums[i])
                helper(i + 1, k, ls)
                ls.pop()
            return
        
        out = [[]]
        for k in range(1, len(nums) + 1):
            ls = []
            helper(0, k, ls)
        return out

