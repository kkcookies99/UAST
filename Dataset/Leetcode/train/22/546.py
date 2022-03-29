 class Solution:
    def XXX(self, n: int) -> List[str]:
        ret = ['']
        def zcc(t):
            if t == 0:
                return 
            bei = []
            for obj in ret:
                if '()'+obj not in bei:
                    bei.append('()'+obj)
                i = 0
                while i < len(obj):
                    if obj[i] == '(':
                        if obj[:i+1] + '()' + obj[i+1:] not in bei:
                            bei.append(obj[:i+1] + '()' + obj[i+1:])
                    i += 1
            ret[:] = bei
            return zcc(t-1)
        zcc(n)
        return ret

