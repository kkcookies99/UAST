class Solution:
    def XXX(self, x: int) -> int:
        if x < 0:
            ans = (0 - int(str(0 - x)[::-1]))
        else:
            ans = int(str(x)[::-1])
        if ans < -2 ** 31 or ans > 2 ** 31 -1:
            return 0
        return ans

