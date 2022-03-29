 class Solution:
    def XXX(self, numRows: int) -> List[List[int]]:
        if numRows==0:return []
        r=[[1]]
        for i in range(1,numRows):
            a=[]
            for j in range(i+1):
                if j==0 or j==i:a.append(1)
                else:a.append(r[-1][j]+r[-1][j-1])
            r.append(a)
        return r

