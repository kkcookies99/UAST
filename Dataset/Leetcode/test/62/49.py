 class Solution:
    def XXX(self, m: int, n: int) -> int:
        d = [1] * n
        for _ in range(1, m):
            for j in range(1, n):
                d[j] += d[j - 1]
        return d[-1]

