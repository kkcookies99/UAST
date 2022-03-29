 class Solution:
    def XXX(self, x: int) -> int:
        s = []
        n = len(s)
        x = str(x)
        ans = ''

        # convert int to list
        for i in range(n):
            s.append(x[i])

        if s[0] == '-':
            for i in range(1, n):
                s[i], s[n-i-1] = s[n-i-1], s[i]
        else:
            for i in range(0, n):
                s[i], s[n-i-1] = s[n-i-1], s[i]

        # list back to str
        for i in range(n):
            ans += s[i]

        return int(ans)


