 class Solution:
    def XXX(self, numRows: int) -> List[List[int]]:
        res=[[1]]
        for i in range(1,numRows):
            res.append([1 for j in range(i+1)])
            for z in range(len(res[-1])):
                if z>0 and z<len(res[-1])-1:
                    res[-1][z] = res[-2][z]+res[-2][z-1]
        return res

