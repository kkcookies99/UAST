 class Solution:
    def XXX(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        中心点到起始点的向量 --> 中心点到上一个点的向量(起始点逆时针90°)
        (i - oi, j - oj) --> (li - oi, lj - oj)
        关系是 (a, b) --> (-b, a), 所以有:
        li = oi + oj - j
        lj = oj - oi + i
        """
        # 根据奇偶, 取出4个小块的第一个小块
        n = len(matrix) // 2  
        m = len(matrix) - n
        # 中心点坐标
        oi = oj = (len(matrix) - 1) / 2
        # 这个小块依次移动
        for i in range(n):
            for j in range(m):
                ci, cj = i, j  # 当前点的位置
                t = matrix[ci][cj]  # 缓存第一个点
                for _ in range(3):
                    li, lj = int(oi + oj - cj), int(oj - oi + ci)  # 求出上一个点的位置
                    matrix[ci][cj] = matrix[li][lj]  # 当前点被上一个点替换
                    ci, cj = li, lj  # 处理上一个点
                matrix[ci][cj] = t  # 最后一个点用缓存的值替换

