 class Solution:
    def XXX(self, haystack: str, needle: str) -> int:
        if needle not in haystack:
            return -1
        elif needle=="":
            return 0
        else:
            return haystack.index(needle)

