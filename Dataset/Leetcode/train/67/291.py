 class Solution:
    def XXX(self, a: str, b: str) -> str:
        t1 = int(a,2)
        t2 = int(b,2)
        t = t1 + t2
        t = bin(int(str(t), 10))
        t = str(t)
        return t[2:]

