 class Solution:
    def XXX(self, a: str, b: str) -> str:
        res = ''
        carry = 0
        while a and b:
            temp = (int(a[-1]) + int(b[-1]) + carry) % 2
            carry = (int(a[-1]) + int(b[-1]) + carry) // 2
            print(carry)
            res = res + str(temp)
            a = a[:-1]
            b = b[:-1]
        if a:
            while a:
                temp = (int(a[-1]) + carry) % 2
                carry = (int(a[-1]) + carry) // 2
                res = res + str(temp)
                a = a[:-1]
        if b:
            while b:
                temp = (int(b[-1]) + carry) % 2
                carry = (int(b[-1]) + carry) // 2
                res = res + str(temp)
                b = b[:-1]
        if carry == 1:
            res = res + str(carry)
        return str(res[::-1])

