 class Solution:
    def XXX(self, s: str) -> int:
        j = 0
        if s:
            i = len(s) -1
            while i >= 0:
                if s[i] == ' ' and not j == 0:
                    return j
                if not s[i] == ' ':
                    j += 1
                i -= 1
        return j

