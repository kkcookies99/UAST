 class Solution:
    def XXX(self, haystack: str, needle: str) -> int:
        if needle not in haystack:
            return -1
        else:
            if needle == '':
                return 0
            else:
                length = len(needle)
                i = 0
                while i < len(haystack):
                    if haystack[i:i + len(needle)] == needle:
                        return i
                    i += 1

