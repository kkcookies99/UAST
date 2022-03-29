 class Solution:
    def XXX(self, n: int) -> List[str]:
        a=[]
        for i in range(2**(2*n)):
            s=bin(i).replace('0b','')
            if len(s)!=2*n:
                s='0'*(2*n-len(s))+s
            s=list(s)
            for j in range(len(s)):
                if s[j]=='0':
                    s[j]='('
                else:
                    s[j]=')'
            a.append(''.join(s))
        b=[]
        for k in a:
            g=k
            for l in range(n):
                g=g.replace('()','')
            if g=='':
                b.append(k)
        return b


