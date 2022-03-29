class Solution:
    def XXX(self, n: int) -> int:
        a, b = 1, 2
        if n < 2:
            return n
        for _ in range(n - 1):
            a, b = b, a + b
        return a

