class Solution:
    def XXX(self, a: str, b: str) -> str:
        res = ''
        i = 0
        d = 0
        while i < len(a) or i < len(b):
            x = int(a[len(a) - 1 - i]) if i < len(a) else 0
            y = int(b[len(b) - 1 - i]) if i < len(b) else 0
            s = x + y + d
            if s < 2:
                d = 0
            if s >= 2:
                s = s - 2
                d = 1
            i = i + 1
            res = str(s) + res
        if d == 1:
            res = str(d) + res
        return res

