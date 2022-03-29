 class Solution:
    def XXX(self, a: str, b: str) -> str:
        cha=len(a)-len(b)
        if cha<0:
            a=r'0'*abs(cha)+a
        elif cha>0:
            b=r'0'*abs(cha)+b
        i=len(a)-1
        newstr=''
        while i>=0:
            s=int(a[i])+int(b[i])+coun
            if s>=2:
                coun=1
                s=s-2
            else:
                coun=0
            newstr=str(s)+newstr
            i-=1
        if coun==1:
            newstr=str(coun)+newstr
        return newstr

