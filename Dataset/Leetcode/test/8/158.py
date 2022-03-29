class Solution:
    def XXX(self, s: str) -> int:
        s = s.strip()
        res = ""
        i = 0
        n = len(s)
        if i < n and s[i] in ["+","-"]:
            res += s[i]
            i += 1
        while i < n:
            if s[i].isdigit():
                res += s[i]
                i += 1
            else:
                break
        try:
            num = int(res)
            if (-2**31)<=num<=(2**31-1):
                return num
            else:
                if num < 0:
                    return -2**31
                else:
                    return 2**31-1
        except:
            return 0

