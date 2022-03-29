 class Solution:
    def XXX(self, num: int) -> str:
        #10**0
        a=['',"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"]
        #10*1
        b=['',"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"]
        #10**2
        c=['',"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"]
        #10**3
        d=['',"M", "MM", "MMM"]
        tenp=[a,b,c,d]
        res=''
        for i in range(4):
            res=tenp[i][num%10]+res
            num//=10
        return res

