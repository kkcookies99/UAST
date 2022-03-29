 class Solution:
    def XXX(self, s: str) -> int:
        result = ''
        neg = False
        i = 0
        while(len(s) > 0 and s[0] == ' '):
            s = s[1:]
        if len(s) > 0:
            neg = s[0] == '-'
            pos = s[0] == '+'
            if neg or pos:
                s = s[1:]
        while(i < len(s) and s[i] in '0123456789'):
            result += s[i]
            i += 1
        if neg:
            result = '-' + result
        try:
            result = int(result)
        except:
            result = 0
        finally:
            result = min(result, 2**31 - 1)
            result = max(result, -2**31)
            return result

