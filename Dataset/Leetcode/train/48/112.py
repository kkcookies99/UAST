class Solution:
    def XXX(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        #方法一：
        #n = len(matrix)
        #for i in range(n):
        #    matrix.insert(len(matrix), [x[i] for x in matrix[n-1::-1]])
        #del matrix[:n]
        
        #方法二：
        matrix = [[i[j] for i in matrix[::-1]] for j in range(len(matrix))]

