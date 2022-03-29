class Solution:
    def XXX(self, str: str) -> int:
        s=0
        d={'0':0,'1':1,'2':2,'3':3,'4':4,'5':5,'6':6,'7':7,'8':8,'9':9}
        flag=True
        sign=1
        for char in str:
            if char==' ' and flag:
                continue
            elif char=='-' and flag:
                sign=-1
                flag=False
            elif char=='+' and flag:
                sign=1
                flag=False
            elif char not in d:
                break
            else:
                s=10*s+d[char]
            flag=False
        ans=s*sign
        if ans>0:
            ans=min(ans,2147483647)
        if ans<0:            
            ans=max(ans,-2147483648)


        return ans

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

