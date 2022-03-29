 class Solution:
    def XXX(self, numRows: int) -> List[List[int]]:
        ret=[[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
        if numRows<6:return ret[:numRows]
        for i in range(5,numRows):
            d=[1]
            n=i-1
            for j in range(n):
                d.append(ret[n][j]+ret[n][j+1])
            d.append(1)
            ret.append(d)
        return ret

