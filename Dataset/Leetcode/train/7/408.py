 class Solution:
    def XXX(self, x: int) -> int:
        sign = '-' if x < 0 else ''
        res = int(sign + str(abs(x))[::-1])
        return res if abs(res) < 2 ** 31 else 0

