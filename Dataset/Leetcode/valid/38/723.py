 class Solution:
    def XXX(self, n: int) -> str:
        a='1'
        b=0
        c=0
        d=''
        if n==1:
            d+='1'
        else:
            for i in range(n-1):
                t=len(a)
                for j in range(t+1):
                    c=a[j-1]
                    if j==0:
                        b=1
                        c=a[0]
                    elif j<t:
                        if a[j]==a[j-1]:
                            b+=1
                        else:
                            d1=list(d)
                            d1.append(b)
                            d1.append(c)
                            d1=[str(k) for k in d1]
                            d=''.join(d1)
                            b=1
                    elif j==t:
                        d1=list(d)
                        d1.append(b)
                        d1.append(c)
                        d1=[str(k) for k in d1]
                        d=''.join(d1)
                a=d
                d=''
        return a

