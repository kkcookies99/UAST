 def XXX(self, haystack: str, needle: str) -> int:
        if needle == '' or not needle:
            return 0
        for i in range(len(haystack)):
            if i + len(needle) > len(haystack):
                return -1
            if haystack[i:i+len(needle)] == needle:
                return i
        return -1

