 class Solution(object):
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        res = []
        len_n = len(nums)
        def dfs(re,index):
            res.append(re)
            for i in range(index,len_n):
                dfs(re+[nums[i]],i+1)
        dfs([],0)
        return  res

