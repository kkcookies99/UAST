class Solution(object):
    def XXX(self, nums):
        res = []
        used = [0 for i in range(len(nums))]
        self.dfs(0,nums,res,[],used)
        return res

    def dfs(self,idx,nums,res,path,used):
        res.append(path[:])
        for i in range(idx,len(nums)):
            path.append(nums[i])
            idx = idx+1
            self.dfs(idx,nums,res,path,used)
            path.pop()

