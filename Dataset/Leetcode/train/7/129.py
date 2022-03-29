class Solution:
    def XXX(self, x: int) -> int:
        s = str(x)
        if s.startswith("-"):
            s1 = s[1:]
            if int("-"+s1[::-1]) < -2**31 - 1 :
                return 0
            return int("-"+s1[::-1])
        else:
            if int(s[::-1]) > 2**31-1:
                return 0
            return int(s[::-1])

