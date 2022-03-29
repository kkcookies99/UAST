class Solution:
    def XXX(self, matrix: List[List[int]]) -> None:
        l=len(matrix)
        for i in range(l//2):
            for j in range(i,l-i-1):
                t=matrix[i][j]
                matrix[i][j]=matrix[l-j-1][i]
                matrix[l-j-1][i]=matrix[l-i-1][l-j-1]
                matrix[l-i-1][l-j-1]=matrix[j][l-i-1]
                matrix[j][l-i-1]=t

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


