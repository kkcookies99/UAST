 class Solution:
    def XXX(self, a: str, b: str) -> str:
        n=0
        m=0
        for i in range(len(a)):
            n+=int(a[-(i+1)])*(2**i)
        for j in range(len(b)):
            m+=int(b[-(j+1)])*(2**j)
        num=n+m
        s=''
        while True:
            x=num//2
            y=num%2
            num=x
            s+=str(y)
            if x==0:
                break
        return s[::-1]

