 class Solution:
    def XXX(self, x: int) -> int:
        if -10 < x <10:
            return x
        else:
            str_x = str(x)
            if str_x[0] != "-":
                str_x = str_x[::-1]
                x = int(str_x)
            else :
                str_x = str_x[:0:-1]
                x = -int(str_x)
            return x if -2147483648<x<2147483647 else 0

