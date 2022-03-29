 class Solution:
    def XXX(self, haystack: str, needle: str) -> int:
        if needle in haystack:
            if haystack==needle:
                return 0
            for i in range(len(haystack)):
                if needle== haystack[i:len(needle)+i]:
                    return i
        else:
            return -1

