 class Solution:
    def XXX(self, x: int) -> int:
        abs_x = abs(x)
        rev =  0
        while abs_x > 0:
            digi= abs_x % 10
            abs_x = abs_x // 10
            rev = rev * 10 + digi
        if x < 0:
            rev = -rev
        if x == 0:
            rev = 0
        if not -2**31 < rev < 2**31-1:
            rev = 0
        return rev

