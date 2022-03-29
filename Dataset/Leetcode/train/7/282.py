class Solution:
    def XXX(self, x: int) -> int:
        if x >=0 :
            out_x = int(str(x)[::-1])
        else:
            out_x = -int(str(-x)[::-1])
        if (out_x>-(2)**31) and (out_x<2**31-1):
            return out_x
        else:
            return 0

