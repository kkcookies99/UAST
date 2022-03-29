 class Solution:
    def XXX(self, numRows: int) -> List[List[int]]:
        res=[]
        for i in range(0,numRows):
            res.append([1])
            for j in range(1,i):
                res[i].append(res[i-1][j-1]+res[i-1][j])
            if len(res[i])<i+1:
                res[i].append(1)
        return res    

