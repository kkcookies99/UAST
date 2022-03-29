 class Solution:
    def XXX(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        import numpy as np
        matrix[:]=np.rot90(matrix,-1).tolist()

