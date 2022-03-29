 class Solution:
    def XXX(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        n=len(matrix)
        for i in range(n):
            for j in range(i,n):#对角交换
                matrix[i][j], matrix[j][i] = matrix[j][i], matrix[i][j]
        for row in matrix:#每行都逆置
            row.reverse()

