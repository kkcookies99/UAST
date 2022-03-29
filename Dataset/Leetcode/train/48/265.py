class Solution(object):
    def XXX(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: None Do not return anything, modify matrix in-place instead.
        """
        def helper(w,l):

            for i in range(0,l-w-1):
                temp = matrix[w][w+i]
                
                matrix[w][w+i] = matrix[l-1-i][w]
                matrix[l-1-i][w] = matrix[l-1][l-1-i]
                matrix[l-1][l-1-i] = matrix[w+i][l-1]
                matrix[w+i][l-1] = temp
            
            if l - w > 2:
                helper(w+1, l-1)
            return matrix
        return helper(0, len(matrix))

