class Solution:
    def XXX(self, x: int) -> bool:
        z=x
        c=0
        while z>0:
            c=c*10+z%10
            z//=10
        return c==x

