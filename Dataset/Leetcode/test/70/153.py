class Solution:
    def XXX(self, n: int) -> int:
        a = 1
        b = 2
        if n==1:
            return a
        if n==2:
            return b      
        for i in range(2,n):
            a,b = b,b+a
        return b