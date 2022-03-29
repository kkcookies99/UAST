 class Solution:
    def XXX(self, s: str) -> int:
        s = s.lstrip()
        res = ''
        import re
        s = re.match('[-|+]?\d+',s)
        if s:
            s = s[0]
            for i in s:
                res += i
            res = int(res)
            if res <= -2**31:
                return -2**31
            elif res >= 2**31 - 1:
                return 2**31 - 1
            else:
                return res
        else:
            return 0

