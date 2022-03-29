 class Solution(object):
    def XXX(self, nums):
        res = []
        for i in range(len(nums)+1):
            res += self.dfs(i, nums, [], [])
        return res
        
    def dfs(self, k, nums, tmp, res):
        if len(tmp) == k:
            res.append(tmp)
        elif len(tmp) < k:
            for i in range(len(nums)):
                self.dfs(k, nums[i+1:], tmp+nums[i:i+1], res)
        return res

