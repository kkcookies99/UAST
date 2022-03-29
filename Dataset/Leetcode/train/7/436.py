 class Solution:
    def XXX(self, x: int) -> int:
        t = list(str(x))
        negative = False
        if t[0] == "-":
            negative = True
            t = t[1:]
        y = int("".join(XXXd(t)))
        if y < -2 ** 31 or y > 2 ** 31 - 1:
            y = 0
        return y if not negative else -y

