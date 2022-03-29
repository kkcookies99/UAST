 class Solution:
    def XXX(self, matrix: List[List[int]]) -> None:
        mlen = len(matrix)
        if mlen <= 0 or mlen is not len(matrix[0]):
            return
        for i in range(mlen):
            for j in range(i):
                tmp = matrix[i][j]
                matrix[i][j] = matrix[j][i]
                matrix[j][i] = tmp

        for i in range(mlen):
            matrix[i].reverse()
       

