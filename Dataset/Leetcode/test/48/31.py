class Solution:
    def XXX(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        n = len(matrix)  # 求出矩阵长度
        m = (n+1)//2     # 求出层数
        for k in range(m):
            t = n-2*k-1 # 需旋转的次数
            for i in range(t):
                # d1，行与k成正比，列与k成正比且与i成正比
                # d2，行与k成反比且与i成反比，列与k成正比
                # d3，行与k成反比，列与k成反比且与i成反比
                # d4，行与k成正比且与i成正比，列与k成反比
                temp = matrix[k][k+i]
                matrix[k][k+i] = matrix[n-1-k-i][k]  
                matrix[n-1-k-i][k] = matrix[n-1-k][n-1-k-i]
                matrix[n-1-k][n-1-k-i] = matrix[k+i][n-1-k]
                matrix[k+i][n-1-k] = temp

