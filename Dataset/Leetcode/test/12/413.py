 class Solution:
    def XXX(self, num: int) -> str:
        d = {1: 'I',5: 'V',10: 'X',50: 'L',100: 'C',500: 'D',1000: 'M',
             4: 'IV',9: 'IX',40: 'XL',90: 'XC',400: 'CD',900: 'CM',0: ''}
        dn = [1,4,5,9,10,40,50,90,100,400,500,900,1000][::-1]
        s = ''
        for i in dn:
            s+=(num//i)*d[i]
            num = num%i
        return s

