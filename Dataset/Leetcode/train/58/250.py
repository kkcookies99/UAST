 class Solution:
    def XXX(self, s: str) -> int:
        length = 0
        for i in range(len(s)-1,-1,-1):
            if s[i] != ' ':
                length += 1
            elif s[i] == ' ' and length > 0:
                return length
        return length

