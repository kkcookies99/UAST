 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        res = []
        def backtrack(nums,temp):
            if not nums:
                res.append(temp)
                return
            for i in range(len(nums)):
                backtrack(nums[:i] + nums[i+1:], temp + [nums[i]])
        backtrack(nums, [])
        return res


