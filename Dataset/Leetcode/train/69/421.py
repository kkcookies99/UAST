class Solution:
    def XXX(self, x: int) -> int:
        if x == 0:
            return 0
        return Solution.tur(self,1,x)
    def tur(self, i, x) -> int:
        if i * i < x:
            return Solution.tur(self,i * 2,x)
        else :
            for t in range(i,0,-1):
                if t * t == x or (t * t < x and (t+1)*(t+1) > x):
                    return t

