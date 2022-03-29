 class Solution:
    def XXX(self, strs: List[str]) -> str:
        if strs == []:
            return ''
        out = strs[0]
        for i in strs:
            while out not in i or i.index(out) != 0:
                out = out[:-1]
                if out == '':
                    return ''

        return out