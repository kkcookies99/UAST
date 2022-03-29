class Solution:
    def XXX(self, a: str, b: str) -> str:
        i,j,res = 1,0,""
        while i <= len(a) and i <= len(b):
            c = int(a[-i])+int(b[-i])+j
            j = c // 2
            res += str(c%2)
            i += 1
        while i > len(a) and i <= len(b):
            c = int(b[-i]) + j
            j = c // 2
            res += str(c%2)
            i += 1
        while i > len(b) and i <= len(a):
            c = int(a[-i]) + j
            j = c // 2
            res += str(c%2)
            i += 1
        if j == 1:
            res += '1'
            return res[::-1]
        else:
            return res[::-1]

