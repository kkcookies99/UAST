class Solution:
    def XXX(self, x: int) -> int:
        flag=0
        x1=x
        if x<0 :
            flag=1
            x1=-x1
        s=0
        while(x1):
            s=s*10+x1%10
            x1//=10
        
        if flag:
            s= -s
        return 0 if s<=-2**31-1 or s>=2**31-1 else s

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

