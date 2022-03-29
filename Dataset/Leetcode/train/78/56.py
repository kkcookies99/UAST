class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        def backtrack(path, index):
            if len(path) <= len(nums):
                output.append(path)
            for i in range(index, len(nums)):
                backtrack(path+[nums[i]], i+1)         
        output = []
        path = []
        backtrack([], 0)
        return output

