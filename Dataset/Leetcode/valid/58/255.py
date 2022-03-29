 class Solution:
    def XXX(self, s: str) -> int:
        count = 0
        tag = False
        for c in s[::-1]:
            if c not in [' ', '\t', '\n']:
                tag = True
                count += 1
            if c in [' ', '\t', '\n'] and tag:
                return count
        return count

