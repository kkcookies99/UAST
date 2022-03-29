class Solution:
    def XXX(self, s: str) -> int:
        a=s
        IV=a.count('IV')
        IX=a.count('IX')
        XL=a.count('XL')
        XC=a.count('XC')
        CD=a.count('CD')
        CM=a.count('CM')
        b=IV*4+IX*9+XL*40+XC*90+CD*400+CM*900
        a2=a.replace('CM','').replace('CD','').replace('XC','').replace('XL','').replace('IX','').replace('IV','')
        I=a2.count('I')
        V=a2.count('V')
        X=a2.count('X')
        L=a2.count('L')
        C=a2.count('C')
        D=a2.count('D')
        M=a2.count('M')
        b+=I+V*5+X*10+L*50+C*100+D*500+M*1000
        return(b

