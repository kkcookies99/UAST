 class Solution(object):
    def XXX(self, nums):
        k = len(nums)
        if not nums or k < 1: return [[]]        
        res = []
        for i in range(k):
            n = self.XXX(nums[:i]+nums[i+1:])
            res += [[nums[i]]+j for j in n]
        return res

