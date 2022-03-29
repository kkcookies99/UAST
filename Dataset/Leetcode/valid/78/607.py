 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        res = [[]]
        for a in nums:
            res.extend(list(map(lambda x: x + [a], res)))
        return res

