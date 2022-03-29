 class Solution:
    def XXX(self, matrix: List[List[int]]) -> None:
        level = 0
        n = len(matrix)
        while level<int(n/2):
            for j in range(level, n-1-level):
                ii,jj = level,j
                last = matrix[n-jj-1][ii]
                for k in range(4):
                    temp = matrix[ii][jj]
                    matrix[ii][jj] = last
                    last = temp
                    ii, jj = jj, n-ii-1
            level += 1

