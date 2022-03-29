class Solution:
    def XXX(self, nums):
        res = [[]]
        for i in nums:
            res += [li+[i] for li in res]
        return res    

