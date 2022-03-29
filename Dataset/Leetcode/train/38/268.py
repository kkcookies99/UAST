class Solution:
    def XXX(self, n: int) -> str:
        if n == 1:
            return '1'
        s = self.XXX(n-1)
        i = 1
        count = 1
        t = ''
        while i < len(s):
            if s[i] == s[i-1]:
                count += 1
            else:
                t += str(count) + s[i-1]
                count = 1
            i += 1
        t += str(count) + s[-1]
        return t

