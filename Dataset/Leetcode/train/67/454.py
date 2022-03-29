class Solution:
    def XXX(self, a: str, b: str) -> str:
        i, j, carry = len(a) - 1, len(b) - 1, 0
        res = []
        while i >= 0 and j >= 0:
            num = carry + int(a[i]) + int(b[j])
            res.append(str(num % 2))
            carry = num // 2
            i -= 1
            j -= 1
        while i >= 0:
            num = carry + int(a[i])
            res.append(str(num % 2))
            carry = num // 2
            i -= 1
        while j >= 0:
            num = carry + int(b[j])
            res.append(str(num % 2))
            carry = num // 2
            j -= 1
        if carry > 0:
            res.append(str(carry))
        return ''.join(reversed(res))

