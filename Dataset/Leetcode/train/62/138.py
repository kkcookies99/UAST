 class Solution:
    def XXX(self, m: int, n: int) -> int:
        path_list = [1]*m
        for i in range(1, n):
            for j in range(1,m):
                path_list[j]+=path_list[j-1]
        return path_list[-1]

