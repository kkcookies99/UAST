class Solution:
    def XXX(self, x):
        r = x // max(1, abs(x)) * int(str(abs(x))[::-1])
        return r if -2**31 <= r <= 2**31 - 1 else 0

