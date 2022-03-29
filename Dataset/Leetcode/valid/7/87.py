class Solution:
    def XXX(self, x: int) -> int:
        if x < 0:
            x = -1*x
            x = int("-" + str(x)[::-1])
        else:
            x = int(str(x)[::-1])
        if x > 2**31-1 or x < -2**31:
            return 0
        return x

