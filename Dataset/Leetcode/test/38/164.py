class Solution:
    def XXX(self, n: int) -> str:
        def go(s):
            res = ''
            s += '#'
            cnt = 1
            for i in range(1, len(s)):
                if s[i] != s[i - 1]:
                    res += str(cnt) + s[i - 1]
                    cnt = 1
                else:
                    cnt += 1
            return res
        res = '1'
        for i in range(n - 1):
            res = go(res)
        return res

