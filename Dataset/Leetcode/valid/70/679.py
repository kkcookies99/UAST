class Solution:
    def XXX(self, n: int) -> int:
        if n <= 2:
            return n
        x, y = 1, 2
        for _ in range(3, n + 1):
            x, y = y, x + y
        return y

