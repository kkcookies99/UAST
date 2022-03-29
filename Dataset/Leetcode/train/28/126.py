 class Solution:
    def XXX(self, haystack: str, needle: str) -> int:
        if not needle:
            return 0
        longer = len(haystack)
        shorter = len(needle)
        first = -1
        for i in range(longer - shorter + 1):
            win = haystack[i:i + shorter]
            if win == needle:
                first = i
                break
        return first

