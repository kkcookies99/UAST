 class Solution:
    def XXX(self, strs: List[str]) -> str:
        if len(strs)==0:
            return ""
        for s in strs:
            if s=="":
                return ""
        s=""

        for i in range(0,200):
            se=set()
            for st in strs:
                if i==len(st):
                    return s
                else:
                    se.add(st[i])
                    if len(se)!=1:
                        return s
            if len(se)==1:
                s+=strs[0][i]

