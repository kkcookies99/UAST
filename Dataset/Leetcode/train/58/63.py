 class Solution:
    def XXX(self, s: str) -> int:
        s = s.strip(' ')
        n =len(s)
        t = s[n:0:-1]
        if ' ' not in s:
            return n
        for i in range(n):
            if t[i] == ' ':
                return i

