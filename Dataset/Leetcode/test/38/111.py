class Solution:
    def XXX(self, n: int) -> str:
        s = ['1']
        for _ in range(n-1):
            t = []
            i = 0
            for j in range(len(s)+1):
                if j == len(s) or s[i] != s[j]:
                    t.append(str(j-i))
                    t.append(s[i])
                    i = j
            s = t
        return ''.join(s)

