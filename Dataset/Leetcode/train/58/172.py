 class Solution:
    def XXX(self, s: str) -> int:
        while s.endswith(' '):
            s = s[:-1]
        return len(s) - s.rfind(' ') -1

