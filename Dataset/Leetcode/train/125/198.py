 class Solution:
    def XXX(self, s: str) -> bool:

        def isIn(ch):
            if ch >= 'a' and ch <= 'z':
                return False
            if ch >= 'A' and ch <= 'Z':
                return False
            if ch >= '0' and ch <= '9':
                return False
            return True

        def lower(ch):
            if ch >= 'A' and ch <= 'Z':
                ch = chr(ord(ch)+32)
            return ch
        
        l = 0
        r = len(s) - 1
        while l < r:
            while l < r and isIn(s[l]):
                l += 1
            while l < r and isIn(s[r]):
                r -= 1
            if lower(s[l]) != lower(s[r]):
                # print(s[l], s[r])
                return False
            l += 1
            r -= 1
        return True

