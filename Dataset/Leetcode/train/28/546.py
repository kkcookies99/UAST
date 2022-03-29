 class Solution:
    def XXX(self, haystack: str, needle: str) -> int:
        if needle == '':
            return 0
        elif needle not in haystack:
            return -1
        else:
            return len(haystack.split(needle)[0])

