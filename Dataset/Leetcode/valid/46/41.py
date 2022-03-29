class Solution(object):
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        if nums is None: return []
        if len(nums) == 1: return [nums]
        res = []
        for x in nums:
            ys=nums+[]
            ys.remove(x)
            for y in self.XXX(ys):
                res.append([x]+y)
        return res

