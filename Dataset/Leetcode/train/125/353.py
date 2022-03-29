 class Solution:
    def XXX(self, s: str) -> bool:
        i = 0
        j = len(s) - 1
        while i <= j:
            if s[i] == s[j] or s[i].lower() == s[j].lower():
                i += 1
                j -= 1
            elif not s[i].isalnum():
                i += 1
            elif not s[j].isalnum():
                j -= 1
            else:
                return False
        return True

