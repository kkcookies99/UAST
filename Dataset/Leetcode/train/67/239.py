 class Solution:
    def XXX(self, a: str, b: str) -> str:
        a = '0b' + a
        b = '0b' + b
        intab = eval(a) + eval(b)
        binab = bin(intab)
        return(binab[2:])

