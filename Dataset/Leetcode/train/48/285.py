class Solution:
    def XXX(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        # matrix[:] = list(map(list, zip(*matrix[::-1])))
        # matrix[:] = [list(x) for x in zip(*matrix[::-1])]
        
        #浅拷贝：执行用时：32 ms, 在所有Python3 提交中击败了94.53%的用户
        a = []
        b = []
        for j in range(len(matrix[0])):
            for i in range(len(matrix)-1, -1, -1):
                a.append(matrix[i][j])
            b.append(a[:])
            a.clear()
        matrix[:] = b
        

