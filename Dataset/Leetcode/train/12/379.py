 class Solution:
    def XXX(self, num: int) -> str:
        m=num//1000
        d=(num%1000)//500
        c=(num%500)//100
        l=(num%100)//50
        x=(num%50)//10
        v=(num%10)//5
        n=(num%5)//1
        rome=''
        for i in range(m):
            rome+='M'
        if c==4:
            if d==1:
                rome+='CM'
            else:
                rome+='CD'
        else:
            for i in range(d):
                rome+='D' 
            for j in range(c):
                rome+='C'
        if x==4:
            if l==1:
                rome+='XC'
            else:
                rome+='XL' 
        else:
            for i in range(l):
                rome+='L'
            for j in range(x):
                rome+='X'
        if n==4:
            if v==1:
                rome+='IX'
            else:
                rome+='IV'
        else:
            for i in range(v):
                rome+='V'
            rome+='I'*n
        return rome

