class Solution:
    def XXX(self, x: int) -> int:
        a = str(x) if x>0 else str(-x)+'-'
        a = int(a[::-1])
        return a if a <= 2**31-1 and a >= -2**31-1 else 0

