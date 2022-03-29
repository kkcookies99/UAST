class Solution:
    def XXX(self, a: str, b: str) -> str:
        trans_a = int(a,2)
        trans_b = int(b,2)
        c = trans_a + trans_b
        c =list(bin(int(c)))
        del c[0]
        del c[0]
        c = "".join(c)
        return c

