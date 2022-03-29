 class Solution:
    def XXX(self, strs: List[str]) -> str:
        i = 0
        if not strs: return ''
        sta = strs[0]
        while i < len(sta):
            for neo in strs:
                if i < len(neo):
                    if neo[i] != sta[i]:
                        return (sta[:i])
                else:
                    return (sta[:i])
            i += 1

