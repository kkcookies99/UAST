 class Solution:
    def XXX(self, matrix: List[List[int]]) -> None:
        matrix[:] = matrix[::-1]
        hang = len(matrix)
        for i in range(hang):
            for j in range(hang):
                if i > j:
                    matrix[i][j],matrix[j][i] = matrix[j][i], matrix[i][j]
        return matrix

