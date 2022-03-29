class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        res = []
        def backtrack(nums, temp):
            if not nums:
                res.append(temp)
                return
            backtrack(nums[1:], temp)
            backtrack(nums[1:], temp+[nums[0]])
        backtrack(nums, [])
        return res        

