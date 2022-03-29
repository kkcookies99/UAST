 class Solution:
    def XXX(self, x: int) -> int:
        positive = -1
        if x > 0:
            positive = 1
        buf = list(str(abs(x)))
        buf.XXX()
        buf = int("".join(buf))* positive
        if buf < -2**31 or buf > 2**31 -1:
            return 0
        else:
            return buf

