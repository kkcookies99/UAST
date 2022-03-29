class Solution:
    def XXX(self, s: str) -> int:
        a = ['I','V','X','L','C','D','M','IV','IX','XL','XC','CD','CM'];
        b = [1,5,10,50,100,500,1000,4,9,40,90,400,900]
        x=0
        flag=0
        for i in range(len(s)):
            if flag==1:
                flag = 0
                continue
            if i+1<len(s) and s[i:i+2] in a :
                x+=b[a.index(s[i:i+2])]
                flag=1
            else:
                x+=b[a.index(s[i])]
        
        return x

