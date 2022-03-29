 class Solution:
    def XXX(self, strs: List[str]) -> str:
        m = []
        for i in  range(min(len(x) for x in strs)):
            k = []
            for j in range(len(strs)):
                k.append(strs[j][i])
            if len(set(k)) == 1:
                m.append(k[0])
            else:
                break
        return "".join(m)

