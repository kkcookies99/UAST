 class Solution:
    def XXX(self, num: int) -> str:
        s = ''
        v = [1000,900,500,400,100,90,50,40,10,9,5,4]
        c = ['M','CM','D','CD','C','XC','L','XL','X','IX','V','IV']
        
        while len(v):
            if num // v[0] > 0:
                s+=c[0]*(num//v[0])
                num = int(num%v[0])
            v = v[1:]
            c = c[1:]
        
        s += 'I'*num
        return s

