 class Solution:
    def XXX(self, haystack: str, needle: str) -> int:
        if needle not in haystack:
            return -1
        if not needle:
            return 0
        i, j = 0, 0
        if needle in haystack:
            return haystack.index(needle)

