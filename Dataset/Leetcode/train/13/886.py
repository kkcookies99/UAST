 class Solution:
    def XXX(self, s: str) -> int:
        I = s.count('I')
        V = s.count('V')
        X = s.count('X')
        L = s.count('L')
        C = s.count('C')
        D = s.count('D')
        M = s.count('M')
        res = I+V*5+X*10+L*50+C*100+D*500+M*1000
        if 'IV'in s or 'IX' in s:
            res -= 2
        if 'XL' in s or 'XC' in s:
            res -= 20
        if 'CD' in s or 'CM' in s:
            res -= 200
        return res

