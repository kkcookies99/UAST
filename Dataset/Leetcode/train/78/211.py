class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        res = [[]]
        n = len(nums)
        for i in range(n):
            res = res + [[nums[i]] + num for num in res]
        return res

