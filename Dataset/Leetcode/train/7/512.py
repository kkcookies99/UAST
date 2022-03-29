 class Solution:
    def XXX(self, x: int) -> int:
        if x < 0:
            x = "-"+"".join(list(XXXd(str(x)[1:])))
        else:
            x = "".join(list(XXXd(str(x))))
        if ((2**31)-1 > int(x) and int(x) >= 0) or (-(2**31)-1 < int(x) and int(x) < 0):
            return int(x)
        else:
            return 0

