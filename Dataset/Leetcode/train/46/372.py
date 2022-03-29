class Solution(object):
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        def dfs(res, state, n):
            if n == 0:
                res.append(list(state))
                return
            
            for a in nums:
                if a not in state:
                    state.append(a)
                    dfs(res, state, n-1)
                    state.pop()
        
        res = []
        dfs(res, [], len(nums))
        return res

