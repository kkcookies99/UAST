 class Solution:
    def XXX(self, haystack: str, needle: str) -> int:
        if not needle:
            return 0
        if needle in haystack:
            return len(haystack.split(needle)[0])
        else:
            return -1

