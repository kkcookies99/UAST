 class Solution:
    def XXX(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        height = len(matrix)
        width = len(matrix[0])
        for i in range(height):
            for j in range(i,width):
                matrix[i][j],matrix[j][i] = matrix[j][i],matrix[i][j]
        for i in range(height):
            for j in range(width//2):
                matrix[i][j],matrix[i][width-1-j] =\
                 matrix[i][width-1-j],matrix[i][j]

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


