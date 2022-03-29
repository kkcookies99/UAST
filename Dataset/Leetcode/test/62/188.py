 class Solution:
    def XXX(self, m: int, n: int) -> int:
        pre = [1]*n
        cur = [1]*n
        for i in range(1,m):
            for j in range(1,n):
                cur[j] = cur[j-1] + pre[j]
            pre = cur[:]
        return cur[-1]

