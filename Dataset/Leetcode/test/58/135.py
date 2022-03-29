 class Solution:
    def XXX(self, s: str) -> int:
        if s.isspace():
            return 0
        length1 = -1
        length2 = len(s)-1
        if s[-1] == ' ':
            for i in range(len(s)-1, -1, -1):
                if s[i] != ' ' :
                    length2 = i
                    break
        for j in range(length2, -1, -1):
            if s[j] == ' ' :
                    length1 = j
                    break
        return length2-length1

