 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        if len(nums) < 1: return []
        res = []
        path = []
        def dfs(nums, path, res):
            if len(nums) < 1: res.append(path)
            for i in range(len(nums)):
                dfs(nums[:i]+nums[i+1:], path+[nums[i]], res)
        dfs(nums, path, res)
        return res

