class Solution:
    def XXX(self, matrix: List[List[int]]) -> None:
        m = len(matrix[0])
        if m%2 == 0:
            n = m//2
            k = m*n
        else: 
            n = m//2 + 1
            k = (m-1)//2*m
        for i in range(k):
            b = i%m
            a = i//m
            if b >= n:continue
            matrix[a][b],matrix[b][-1-a],matrix[-1-a][-1-b],matrix[-1-b][a] = matrix[-1-b][a],matrix[a][b],matrix[b][-1-a],matrix[-1-a][-1-b]

