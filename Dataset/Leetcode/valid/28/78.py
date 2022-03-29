 class Solution:
    def XXX(self, haystack: str, needle: str) -> int:
        if needle and not haystack: return -1
        if needle in haystack:
            return haystack.index(needle)
        else:
            return -1

