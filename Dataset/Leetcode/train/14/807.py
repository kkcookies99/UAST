 class Solution:
    def XXX(self, strs: List[str]) -> str:
        if len(strs) == 1:
            return strs[0]
        res = ''
        for i in range(len(strs[0])):
            for j in range(1, len(strs)):
                if i>len(strs[j])-1 or strs[j][i] != strs[0][i]:
                    return res
            res += strs[0][i]
        return res

