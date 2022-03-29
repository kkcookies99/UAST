 class Solution:
    def XXX(self, strs: List[str]) -> str:
        if not len(strs): 
            return ""
        l=len(strs[0])
        buf=""
        for e in strs:
            if len(e)<l:
                l=len(e)
        if l==0:
            return ""
        for i in range(0,l):
            ch=(strs[0])[i]
            for e in strs:
                if e[i]!=ch:
                    return buf
            buf+=ch
        return buf

