class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        res = [[]]
        for num in nums:
            res.append([num])
            for temp in res[1:-1]:
                res.append(temp+[num])
        return res

