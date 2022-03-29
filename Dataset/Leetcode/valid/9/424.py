 class Solution:
    def XXX(self, x: int) -> bool:
        n = 0
        y = x
        while y > 0:
            n = n * 10 + y % 10
            y = y // 10
        return [x == n, False][x < 0]

