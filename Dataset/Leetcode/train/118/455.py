 class Solution:
    def XXX(self, numRows: int) -> List[List[int]]:
        res = []
        for i in range(1,numRows+1):
            temp = []
            for j in range(i):
                if i>2 and j!=0 and j!=i-1:
                    temp.append(res[i-2][j]+res[i-2][j-1])
                else:
                    temp.append(1)
            res.append(temp)
        return res

