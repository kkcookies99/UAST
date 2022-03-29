 class Solution:
    def XXX(self, a: str, b: str) -> str:
        a_l = len(a) - 1
        b_l = len(b) - 1

        res = ""
        carry = 0
        while a_l >= 0 or b_l >= 0:
            if a_l >= 0:
                 carry += (ord(a[a_l]) - ord('0'))
                 a_l -= 1
            if b_l >= 0:
                 carry += (ord(b[b_l]) - ord('0'))
                 b_l -= 1

            res = str(carry%2) + res
            carry = carry // 2

        if carry > 0:
            res = "1" + res

        return res

