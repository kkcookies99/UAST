 class Solution:
    def XXX(self, matrix: List[List[int]]) -> None:
        lens = len(matrix)
        x = 0
        for i in range(lens//2):
            x = i*(lens+1)
            pos_n = lens**2-i*lens-(i+1)
            pos_y = (i+1)*(lens-1)
            conver = lambda x:(x//lens, x%lens)
            for _ in range(lens-2*i-1):
                pos_m = x+pos_n-pos_y
                x_row, x_col = conver(x)
                y_row, y_col = conver(pos_y)
                n_row, n_col = conver(pos_n)
                m_row, m_col = conver(pos_m)
                matrix[x_row][x_col],matrix[y_row][y_col],matrix[m_row][m_col],matrix[n_row][n_col] = matrix[m_row][m_col],matrix[x_row][x_col],matrix[n_row][n_col],matrix[y_row][y_col]
                pos_y += lens
                pos_n -= 1
                x_row += 1
                x += 1

