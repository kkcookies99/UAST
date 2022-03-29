 class Solution:
    def XXX(self, s: str) -> bool:
        if not s: return True
        n = len(s)
        i, j = 0, n-1
        while i < j:
            while i < j and not s[i].isalnum():
                i += 1
            while j > i and not s[j].isalnum():
                j -= 1
            if s[i].lower() != s[j].lower():
                return False
            else:
                i += 1
                j -= 1
        return True

