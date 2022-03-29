class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        res = [[]]
        for num in nums:
            res += [i + [num] for i in res]
        return res

