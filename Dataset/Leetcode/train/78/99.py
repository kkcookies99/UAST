class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        flag = [0 for i in nums]
        res = [[]]
        for i in nums:
            tem = deepcopy(res)
            for j in range(len(tem)):
                tem[j].append(i)
            res.extend(tem)
        return res


