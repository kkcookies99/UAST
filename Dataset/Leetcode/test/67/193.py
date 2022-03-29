 class Solution:
    def XXX(self, a: str, b: str) -> str:
        l = '0'
        res = ''
        starta = len(a)-1
        startb = len(b)-1
        while  starta>=0 or startb>=0:
            na = a[starta] if starta >= 0 else '0'
            nb = b[startb] if startb >= 0 else '0'
            if na==nb:
                res = l + res
                l = na
            elif l=='0':
                res = '1' + res
            else:
                res = '0' + res
            starta -= 1
            startb -= 1
        return res if l=='0' else l + res

