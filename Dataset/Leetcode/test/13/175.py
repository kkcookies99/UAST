class Solution(object):
    def XXX(self, s):
        I,V,X,L,C,D,M = 1,5,10,50,100,500,1000
        IV,IX,XL,XC,CD,CM = 4,9,40,90,400,900
        res = 0
        for i in s:
            res += eval(i)
        for j in ['IV','IX','XL','XC','CD','CM']:
            if j in s:
                res += eval(j)
                res -= eval(j[0])
                res -= eval(j[1])
        return res

