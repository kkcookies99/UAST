class Solution:
    def XXX(self, a: str, b: str) -> str:
        a, b = a[::-1], b[::-1]
        if len(a) < len(b):
            a, b = b, a
        b += "0" * (len(a) - len(b))
        res = ""
        carrier = 0
        for i, j in zip(a, b):
            cur = (int(i) + int(j) + carrier) % 2
            carrier = (int(i) + int(j) + carrier) // 2
            res += str(cur)
        res += str(carrier)
        return str(int(res[::-1]))

