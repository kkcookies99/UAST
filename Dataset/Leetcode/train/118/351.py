 class Solution:
    def XXX(self, numRows: int) -> List[List[int]]:
        if not numRows:
            return []
        if numRows==1:
            return[[1]]
        l=[[1]]    
        for i in range(1,numRows):
            l1=[]
            for j in range(0,i+1):
                if j==0 or j==i:
                    l1.append(1)
                else:
                    l1.append(l[i-1][j-1]+l[i-1][j])
            l.append(l1)
        return l

