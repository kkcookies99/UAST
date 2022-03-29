class Solution(object):
    def XXX(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: None Do not return anything, modify matrix in-place instead.
        """
        #x轴反转
        m = len(matrix)-1
        n = len(matrix) // 2
        for i in range(n):
            matrix[i],matrix[m-i] = matrix[m-i],matrix[i]
            
        #对角线反转
        for i in range(m+1):
            for j in range(i+1,m+1):
                matrix[i][j],matrix[j][i] = matrix[j][i],matrix[i][j]

