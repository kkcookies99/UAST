 class Solution:
    def XXX(self, haystack: str, needle: str) -> int:
        if needle == "":
            return 0
        if haystack == "":
            return -1
            
        needle_len = len(needle)
        haystack_len = len(haystack)
        for i in range(haystack_len):
            if i+needle_len <= haystack_len and haystack[i:i+needle_len] == needle:
                return i

        return -1

