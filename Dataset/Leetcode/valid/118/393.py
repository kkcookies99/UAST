 class Solution:
    def XXX(self, numRows: int) -> List[List[int]]:
        if numRows<1:
            return []
        res = [[1]]
        for i in range(1,numRows):
            tmp = [1]*(i+1)
            for j in range(1,i):
                tmp[j] = res[i-1][j-1] + res[i-1][j]
            res.append(tmp)
        return res

