 class Solution:
    def XXX(self, x: int) -> int:
        a = abs(x)
        a = str(a)
        b = 0
        num = len(a)
        for i in range(num):
            b = b + int(a[i])*(10**i)
        if b>=-2**31 and b<2**31-1:
            if x > 0:
                return b
            else:
                return -b
        else:
            return 0

