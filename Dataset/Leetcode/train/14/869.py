 class Solution:
    def XXX(self, strs: List[str]) -> str:
        res=strs[0]
        for i in range(1,len(strs)):
            b=strs[i]
            if b=="":
                return b
            if len(b)<len(res):
                res=res[:len(b)]
                while res and res!=b:
                    res=res[:-1]
                    b=b[:-1]
                if not res:
                    return ""
            else:
                bn=b[:len(res)]
                while bn and res!=bn:
                    res=res[:-1]
                    bn=bn[:-1]
                if not bn:
                    return ""
        return res

