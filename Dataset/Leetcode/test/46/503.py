 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:

        res = [] 
        def backtrack(k, t):
            if len(t) == len(nums):
                import copy
                res.append(copy.deepcopy(t))
                return 
            for i in range(len(nums)):
                if nums[i] in t:continue 
                t = t + [nums[i]] 
                backtrack(i, t)
                t.pop(-1)
        backtrack(0,[])
        return res 

