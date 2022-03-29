 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        res = []
        path = []
        def backtrack(first):
            if first == len(nums):
                res.append(path.copy())
                return
            path.append(nums[first])
            backtrack(first+1)
            path.pop()
            backtrack(first+1)
            return
        backtrack(0)
        return res
            

