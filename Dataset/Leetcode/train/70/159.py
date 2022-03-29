class Solution:
    def XXX(self, n: int) -> int:
        if n<=2:
            return n
        f1=1;f2=1
        for i in range(2,n+1):
            f3=f1+f2
            f1=f2
            f2=f3
        return f2

