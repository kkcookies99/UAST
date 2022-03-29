 class Solution:
    def XXX(self, x: int) -> int:

        str_x = str(abs(x))
        res = int(str_x[::-1])
        if x < 0:
            res = -res
        return res if -2**31 <= res <=2**31-1 else 0

