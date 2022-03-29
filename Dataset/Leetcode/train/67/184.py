 class Solution:
    def XXX(self, a: str, b: str) -> str:
        inta=0
        intb=0
        for i in range (len(a)):
            inta=inta+int(a[i])*2**(len(a)-1-i)
        for j in range (len(b)):
            intb=intb+int(b[j])*2**(len(b)-1-j)
        c=inta+intb
        if c == 0:
            return '0'
        def Dec2Bin(dec):           #10进制转化为2进制
            result = ''
            if dec:
                result = Dec2Bin(dec // 2)
                return result + str(dec % 2)
            else:
                return result
        return Dec2Bin(c)

