 class Solution:
    def XXX(self, x: int) -> int:
        n = str(x)
        if n[0] != '-':
            n1 = n[::-1]
            n2 = int(n1)
            if n2 <=2**31-1:
                return n2
            else:
                return 0
        else:
            n1 = n[0] + n[:0:-1]
            n2 = int(n1)
            if n2 >=-2**31:
                return n2
            else:
                return 0
        return []

