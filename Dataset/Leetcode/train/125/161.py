 class Solution:
    def XXX(self, s: str) -> bool:
        i, j = 0, len(s)-1
        while i < j:
            if not s[i].isalnum():
                i += 1
                continue
            if not s[j].isalnum():
                j -= 1
                continue

            if s[i].lower() == s[j].lower():
                i += 1
                j -= 1
                continue
            return False
        return True


