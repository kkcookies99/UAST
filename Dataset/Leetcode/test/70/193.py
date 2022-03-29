class Solution:
    def XXX(self, n: int) -> int:
        p = 1
        t = 1
        while n>0:
            n-=1
            p,t = p+t,p
        return t

