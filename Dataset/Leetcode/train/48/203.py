class Solution:
    def XXX(self, matrix: List[List[int]]) -> None:
        n = len(matrix)
        x = 0
        for i in range(n//2):
            for j in range(x, n-x-1):
                matrix[i][j], matrix[j][-(i+1)], matrix[-(i+1)][-(j+1)], matrix[-(j+1)][i] = matrix[-(j+1)][i],  matrix[i][j],matrix[j][-(i+1)], matrix[-(i+1)][-(j+1)]
            x += 1
        return

