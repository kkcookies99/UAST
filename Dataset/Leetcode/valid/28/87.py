 class Solution:
    def XXX(self, haystack: str, needle: str) -> int:
        if needle not in haystack:
            return -1
        needle_length = len(needle)
        haystack_length = len(haystack)
        if len(needle) > len(haystack):
            return -1
        if needle_length == 0:
            return 0
        else:
            for index in range(len(haystack)):
                if haystack[index] == needle[0]:
                    if haystack[index:index+needle_length] == needle:
                        return index

