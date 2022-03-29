class Solution:
    def XXX(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        copy_matrix = [m[:] for m in matrix]
        for i in range(len(copy_matrix)):
            for j in range(len(copy_matrix[i])):
                matrix[j][-(i+1)] = copy_matrix[i][j]

