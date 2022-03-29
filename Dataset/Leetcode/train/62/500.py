class Solution:
    def XXX(self, m: int, n: int) -> int:
        a=[];b=[]
        for i in range(n):
            a.append(1)
        for j in range(m):
            b.append(a)
        for i in range(1,m):
            for j in range(1,n):
                b[i][j]=b[i-1][j]+b[i][j-1]
        return b[m-1][n-1]

