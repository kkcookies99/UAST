class Solution:
    def XXX(self, a: str, b: str) -> str:
        n1 = len(a)
        n2 = len(b)
        i, j = n1 - 1, n2 - 1
        res = ''
        f = 0
        while i >= 0 and j >= 0:
            num1 = int(a[i])
            num2 = int(b[j])
            s = (num1 + num2 + f)
            if s == 0:
                res = res + '0'
                f = 0
            elif s == 1:
                res = res + '1'
                f = 0
            elif s == 2:
                res = res + '0'
                f = 1
            else:
                res = res + '1'
                f = 1

            i = i - 1
            j = j - 1
        while i >= 0:
            num1 = int(a[i])
            if num1 + f == 2:
                res = res + '0'
                f = 1
            elif num1 + f == 0:
                res = res + '0'
                f = 0
            elif num1 + f == 1:
                res = res + '1'
                f = 0
            else:
                res = res + '1'
                f = 1
            i = i - 1
        while j >= 0:
            num2 = int(b[j])
            if num2 + f == 2:
                res = res + '0'
                f = 1
            elif num2 + f == 0:
                res = res + '0'
                f = 0
            elif num2 + f == 1:
                res = res + '1'
                f = 0
            else:
                res = res + '1'
                f = 1
            j = j - 1
        if f != 0:
            res = res + '1'

        return res[::-1]


