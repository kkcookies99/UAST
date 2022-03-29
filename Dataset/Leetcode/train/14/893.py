 class Solution:
    def XXX(self, strs: List[str]) -> str:
        i = 1
        while i <= len(strs[0]):
            for j in range(1, len(strs)):
                if strs[0][:i] != strs[j][:i]:
                    if i == 1:
                        return ''
                    return strs[0][:i-1]
            i += 1
        return strs[0]

