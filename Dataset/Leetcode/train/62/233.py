 class Solution:
    def XXX(self, m: int, n: int) -> int:
        """
        回溯，穷举搜索
        """
        res = 0
        # 访问者数组
        visited = [[0] * n for j in range(m)]
        directions = [[0, 1], [1, 0]]

        def helper(i, j):
            nonlocal res
            if i==m-1 and j==n-1:
                res += 1
                return
            for x,y in directions:
                new_i = x + i 
                new_j = y + j 
                if 0<=new_i<m and 0<=new_j<n and visited[new_i][new_j]==0:
                    visited[new_i][new_j]=1
                    helper(new_i, new_j)
                    visited[new_i][new_j]=0
        helper(0, 0)
        return res```

