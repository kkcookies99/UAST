 class Solution:
    def XXX(self, num: int) -> str:
        R=''
        a=num//1000
        num%=1000
        R+='M'*a
        a=num//900
        num%=900
        R+='CM'*a
        a=num//500
        num%=500
        R+='D'*a
        a=num//400
        num%=400
        R+='CD'*a
        a=num//100
        num%=100
        R+='C'*a
        a=num//90
        num%=90
        R+='XC'*a
        a=num//50
        num%=50
        R+='L'*a
        a=num//40
        num%=40
        R+='XL'*a
        a=num//10
        num%=10
        R+='X'*a
        a=num//9
        num%=9
        R+='IX'*a
        a=num//5
        num%=5
        R+='V'*a
        a=num//4
        num%=4
        R+='IV'*a
        R+='I'*num
        return R

