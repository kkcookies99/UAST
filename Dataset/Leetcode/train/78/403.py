 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        res = [[]]
        if not nums:
            return res
        for num in nums:
            for re in res:
                res = res + [re+[num]]
        return res

