class Solution:
    def XXX(self, x: int) -> int:
        a = int(str(x)[::-1]) if x>=0 else -int(str(-x)[::-1])
        return a if -2 ** 31 <= a <= 2 ** 31 -1 else 0

