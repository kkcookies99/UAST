 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        res = [[]]
        for i in nums:
            res.append([i])
            for j in res[1:-1]:
                res.append(j+[i])
        return res

