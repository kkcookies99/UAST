 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        res = [[]]
        if not nums:
            return res
        for i in nums:
            for j in range(len(res)):
                temp = res[j][:]
                temp.append(i)
                res.append(temp)
        return res

