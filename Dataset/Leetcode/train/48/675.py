 class Solution:
    def XXX(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        print(3//2)
        l = len(matrix)-1
        for i in range(l):
            for j in range(l-i):
                matrix[i][j], matrix[l-j][l-i] = matrix[l-j][l-i], matrix[i][j]
        for i in range(l//2+1):
            matrix[i], matrix[l-i] = matrix[l-i], matrix[i]
        

