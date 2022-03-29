 class Solution:
    def XXX(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        if matrix==[] or matrix==[[]]:
            return
        n=len(matrix)
        def func_sub_XXX(x1,y1,x2,y2,x3,y3,x4,y4):
            matrix[x1][y1],matrix[x2][y2],matrix[x3][y3],matrix[x4][y4]=matrix[x4][y4],matrix[x1][y1],matrix[x2][y2],matrix[x3][y3]

        def func_XXX(i):
            mod=n-2*i-1
            for diff in range(mod):
                func_sub_XXX(i,i+diff,i+diff,i+mod,i+mod,i+mod-diff,i+mod-diff,i)
                
        i=0
        while True:
            func_XXX(i)
            if i==n-i-1 or i+1==n-i-1:
                break
            else:
                i+=1

