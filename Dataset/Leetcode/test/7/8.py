class Solution:
    def XXX(self, x: int) -> int:
        y = [1, -1][x < 0] * int(str(abs(x))[::-1])
        return y if y.bit_length() < 32 else 0

