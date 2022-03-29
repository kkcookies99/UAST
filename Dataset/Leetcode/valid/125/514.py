 class Solution:
    def XXX(self, s: str) -> bool:
        resStr = ''
        for c in s.lower() :
            if c.isalnum() :
                resStr += c
        return resStr == resStr[::-1]


