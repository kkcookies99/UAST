 class Solution:
    def XXX(self, haystack: str, needle: str) -> int:
        if not needle:
            return 0

        i = 0
        j = 0
        while len(haystack) - i >= len(needle):
            cur_i = i
            while j < len(needle) and haystack[cur_i] == needle[j]:
                cur_i += 1
                j += 1
            if j == len(needle):
                return i
            j = 0
            i += 1

        return -1

