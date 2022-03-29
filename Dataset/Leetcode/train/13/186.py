class Solution:
    def XXX(self, s: str) -> int:
        l = ['I','V','X','L','C','D','M']
        l1 = [1,5,10,50,100,500,1000]
        h = {}
        for i in range(7):
            h[l[i]] = l1[i]
        r = 0
        for i in s:
            r += h[i]
        if 'IV' in s:
            r -= 2
        if 'IX' in s:
            r -= 2
        if 'XL' in s:
            r -= 20
        if 'XC' in s:
            r -= 20
        if 'CD' in s:
            r -= 200
        if 'CM' in s:
            r -= 200
        return r
            
            

