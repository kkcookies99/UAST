class Solution:
    def XXX(self, x: int) -> int:
        if x < 0:
            s = str(x)
            s = s[-1:-len(s):-1]
        else:
            s = str(x)[::-1]
        num = int(s) if len(s) == len(str(x)) else int("-" + s)
        if num > (2 ** 31 - 1) or num < -2 ** 31:
            return 0
        return num

