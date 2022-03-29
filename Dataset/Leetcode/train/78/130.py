class Solution(object):
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        res = [[]]
        self.helper(res, nums, [])
        return res

    def helper(self,res, nums, re):
        for i in range(0,len(nums)):
            sub = re + [nums[i]]
            res.append(sub)
            self.helper(res, nums[i + 1:], sub)

