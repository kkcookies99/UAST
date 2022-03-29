class Solution:
    def XXX(self, matrix: list[list[int]]) -> None:
        n = len(matrix)
        matrix_flag = [[None]*n for _ in range(n)]
        for j in range(n):
            for i in range(n):
                if matrix_flag[j][n-i-1] is None:
                    matrix_flag[j][n-i-1] = matrix[j][n-i-1]
                matrix[j][n-i-1] = matrix[i][j] if matrix_flag[i][j] is None else matrix_flag[i][j]

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


