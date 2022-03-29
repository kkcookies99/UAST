 class Solution:
    def XXX(self, a: str, b: str) -> str:
        lena=len(a)
        lenb=len(b)
        l=max(lena,lenb)
        if lena<=lenb:
            a='0'*(l-lena)+a
        else:
            b='0'*(l-lenb)+b
        carry=0
        res=''
        for i in range(l):
            add=int(a[l-1-i])+int(b[l-1-i])+carry
            if add>=2:
                add=add%2
                carry=1
            else:
                carry=0
            res=str(add)+res
        if carry==1:
            res='1'+res
        return res

