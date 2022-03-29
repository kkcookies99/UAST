 class Solution:
    def XXX(self, haystack: str, needle: str) -> int:
        if needle=='':return 0
        h=len(haystack)
        end=n=len(needle)
        for i in range(h+1):
            if end>h:return -1
            if haystack[i:end]==needle:return i
            else:end=i+n+1

