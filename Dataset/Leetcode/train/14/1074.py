 class Solution:
    def XXX(self, strs: List[str]) -> str:
        if len(strs) == 0:
            return ""

        if len(strs) == 1:
            return strs[0]
            
        if len(strs[0]) == 0:
            return ""

        cp = ""
        index = 0
        while index < len(strs[0]):
            for s in strs[1:]:
                if index < len(s):
                    if strs[0][index] != s[index]:
                        return cp
                else:
                    return cp
            cp += strs[0][index]
            index += 1

        return cp

