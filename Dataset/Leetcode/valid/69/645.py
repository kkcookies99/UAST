class Solution:
    def XXX(self, x: int) -> int:
        x1 = 1.0
        while abs(x - x1*x1) > 1e-6:
            x1 = (x1*x1 + x) / (2*x1)
        return int(x1)

