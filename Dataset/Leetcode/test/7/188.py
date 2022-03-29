class Solution:
    def XXX(self, x: int) -> int:
        if x < (-2 ** 31) or (x > 2 ** 31 - 1):
            return 0
        elif x >= 0:
            return int(str(x)[::-1])
        else:
            return int(str(x)[1:][::-1]) * -1

