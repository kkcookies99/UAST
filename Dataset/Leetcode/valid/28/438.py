 class Solution:
    def XXX(self, haystack: str, needle: str) -> int:
        if needle not in haystack:
            return -1
        if needle == "":
            return 0
        haystack_list = list(haystack)
        needle_len = len(needle)
        haystack_len = len(haystack)
        for i in range(haystack_len):
            if haystack[i:i+needle_len] == needle:
                return i

