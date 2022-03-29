 class Solution:
    def __init__(self):
        self.buff = set("abcdefghijklmnopqrstuvwxyz0123456789")

    def XXX(self, s: str) -> bool:
        if not s:
            return True
        s, l, r = s.lower(), 0, len(s) - 1
        while l < r:
            while l < r and s[l] not in self.buff:
                l += 1
            while l < r and s[r] not in self.buff:
                r -= 1
            if l >= r:
                break
            elif s[l] != s[r]:
                return False
            l, r = l + 1, r - 1
        return True

