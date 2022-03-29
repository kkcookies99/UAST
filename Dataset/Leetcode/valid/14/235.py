 class Solution:
    def XXX(self, strs: List[str]) -> str:
        s = ""
        if strs == []:
            return s
        l = len(strs[0])
        strs.sort()
        for i in range(len(strs)):
            l = min(l,len(strs[i]))
        for i in range(l):
            if strs[0][i] == strs[-1][i]:
                s += strs[0][i]
            else:
                return s
        return s

