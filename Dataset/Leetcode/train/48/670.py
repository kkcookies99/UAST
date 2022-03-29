 class Solution:
    def XXX(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        if len(matrix)<2:
            return matrix
        lie=len(matrix)
        row=lie
#对角翻转
        for i in range(lie):
            for j in range(i+1):
                t=matrix[i][j]
                matrix[i][j]=matrix[j][i]
                matrix[j][i]=t
#每一行逆序
        for i in range(lie):
            matrix[i]=matrix[i][::-1]
        return matrix```

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


