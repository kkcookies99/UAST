class Solution:
    def XXX(self, a: str, b: str) -> str:
        la = len(a)
        lb = len(b)
        if la < lb:
            a = '0' * (lb - la) + a
            la = lb
        else:
            b = '0' * (la - lb) + b
            lb = la
        res = ""
        carryon = False
        for i in range(la - 1, -1, -1):
            digit = int(a[i]) + int(b[i])
            if carryon:
                digit += 1
            if digit >= 2:
                res += str(digit % 2)
                carryon = True
            else:
                res += str(digit)
                carryon = False
        if carryon:
            res += '1'
        return res[::-1]

