class Solution:
     def XXX(self, nums):
        used = [True for i in range(len(nums))]
        res = []
        path = []
        def backtrack():
            if len(path) == len(nums):
                res.append(path.copy())
            for i in range(len(nums)):
                if used[i]:
                    used[i] = False
                    path.append(nums[i])
                    backtrack()
                    used[i] = True
                    path.pop()
        
        backtrack()
        return res

