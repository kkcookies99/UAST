 class Solution:
    def XXX(self, strs: List[str]) -> str:
        l = min([len(i) for i in strs])
        k = 0
        while k < l:
            for str in strs:
                if str[k] != strs[0][k]:
                    return strs[0][0:k]
            k += 1
        return strs[0][0:k]

