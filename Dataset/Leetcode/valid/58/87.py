 class Solution:
    def XXX(self, s: str) -> int:
        s = s.strip(' ')
        if not s:
            return 0
        else:
            L = s.split(' ')
            return len(L[-1])

