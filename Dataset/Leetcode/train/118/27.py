 class Solution:
    def XXX(self, numRows: int) -> List[List[int]]:
        res = [[1]]
        for i in range(1, numRows):
            r = [1]
            for j in range(1, i):
                r.append(res[-1][j-1] + res[-1][j])
            r.append(1)
            res.append(r)
        return res

