class Solution:
    def XXX(self, n: int) -> int:
        a=1
        b=2
        if n == 1 or n == 2:
            return n
        for x in range(2,n):
            a,b = b,a+b
        return b

