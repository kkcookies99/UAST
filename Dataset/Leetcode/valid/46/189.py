class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        res, queue = [],dict()
        self.dfs(nums,res,queue)
        return res
    
    def dfs(self,nums,res,queue):
        if len(queue) == len(nums):
            res.append(list(queue))
            return 
        for i in nums:
            if i not in queue:
                queue[i] = 1
                self.dfs(nums,res,queue)
                queue.pop(i)

