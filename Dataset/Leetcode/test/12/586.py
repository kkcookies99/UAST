 class Solution:
    def XXX(self, num: int) -> str:
        a=['M','CM','D','CD','C','XC','L','XL','X','IX','V','IV','I']
        b=[1000,900,500,400,100,90,50,40,10,9,5,4,1]
        ret=''
        for i in range(len(a)):
            ret=ret+num//b[i]*a[i]
            num=num%b[i]
        return ret

