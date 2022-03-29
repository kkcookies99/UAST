class Solution:
    def XXX(self, n: int) -> int:
        f=lambda x:f(x-1)*x if x>=2 else 1
        i=r=1
        while n>i:
            n-=1
            r+=f(n)/(f(i)*f(n-i))
            i+=1
        return int(r)

