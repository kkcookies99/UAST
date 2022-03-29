class Solution:
    def XXX(self, nums):
        def dfs(conbination,nums):
            if not nums:
                res.append(conbination)
                return
            else:
                for i in range(len(nums)):
                    dfs(conbination+[nums[i]], nums[:i]+nums[i+1:])
        conbination = []
        res=[]
        dfs(conbination,nums)
        return res

