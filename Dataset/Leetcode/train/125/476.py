 class Solution:
    def XXX(self, s: str) -> bool:
        if not s: return True
        l, r = 0, len(s)-1
        while l <= r:
            if not s[l].isalnum():
                l += 1
                continue
            if not s[r].isalnum():
                r -= 1
                continue
            a1, a2 = ord(s[l]), ord(s[r])
            if a1 == a2 or (s[r].isalpha() and s[l].isalpha() and (a1 + 32 == a2 or a1 - 32 == a2)):
                l += 1
                r -= 1
            else:
                return False
        return True

