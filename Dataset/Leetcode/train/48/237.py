class Solution(object):
    def XXX(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: None Do not return anything, modify matrix in-place instead.
        """
        n = len(matrix)

        for i in range(0,int((n+1)/2)):
            for j in range(0,int(n/2)):
                #将(i,j)移到(j,n-1-i),依此类推
                [matrix[j][n-1-i], matrix[n-1-i][n-1-j], matrix[n-1-j][i], matrix[i][j]] = [matrix[i][j], matrix[j][n-1-i], matrix[n-1-i][n-1-j], matrix[n-1-j][i]]

        return matrix

