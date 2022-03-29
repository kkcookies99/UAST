class Solution:
    def XXX(self, x: int) -> int:
        if (t := x) < 2:
            return x
        while dt := (t * t - x) // (t << 1):
            t -= dt
        return t - 1

