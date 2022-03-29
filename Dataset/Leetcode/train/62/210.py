 class Solution:
    def XXX(self, m: int, n: int) -> int:
        matrix=[[0 for _ in range(n)] for _ in range(m)]
        for i in range(m):
            for j in range(n):
                if i==0 or j==0:
                    matrix[i][j]=1
                else:
                    matrix[i][j]=matrix[i-1][j]+matrix[i][j-1]
        return matrix[m-1][n-1]

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


