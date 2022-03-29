class Solution:
    def XXX(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        if len(matrix)==1:
            return matrix
        n=len(matrix)
        t=n-1
        for i in range(n):
            for j in range(n):
                if t<n and t>=0:
                    matrix[i][j]=matrix[t][i]
                t-=1
            t=n-1

