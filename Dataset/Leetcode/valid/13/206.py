class Solution:
    def XXX(self, s: str) -> int:
        a = ['I','V','X','L','C','D','M','IV','IX','XL','XC','CD','CM',]
        b = [1, 5, 10, 50, 100, 500, 1000, 4, 9, 40, 90, 400, 900 ]
        d1 = dict(zip(a[-6:], b[-6:]))
        d2 = dict(zip(a[:-6], b[:-6]))
        d = dict(zip(a,b))
        c = 0
        i = 0
        while i < len(s):
            if s[i:i+2] in d1:
                c += d1[s[i:i+2]]
                i += 2
            elif s[i] in d2:
                c += d2[s[i]]
                i += 1
        return c  

