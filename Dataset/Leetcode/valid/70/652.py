class Solution:
    def XXX(self, n: int) -> int:
        r1, r2 = 1, 2
        for i in range(3, n+1):
            r1, r2 = r2, r1 + r2
        return r2 if n > 2 else n

