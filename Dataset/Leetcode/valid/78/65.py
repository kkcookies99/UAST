class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        res = [[]]
        for i in nums:
            res += [t+[i] for t in res]
        return res

