 class Solution:
    def XXX(self, numRows: int) -> List[List[int]]:
        if numRows == 0:
            return []
        res =[[1]]
        for i in range(numRows - 1):
            tmp = [1]
            for j in range(1, len(res[-1])):
                tmp.append(res[-1][j] + res[-1][j - 1])
            tmp.append(1)
            res.append(tmp)
        return res

