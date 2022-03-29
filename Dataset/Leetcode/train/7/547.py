 class Solution:
    def XXX(self, x):
        if x != 0:
            y = int(str(abs(x))[::-1]) * (x // abs(x))
            if y >= -2 ** 31 and y <= 2 ** 31 - 1:
                return y
        return 0

