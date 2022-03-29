 class Solution:
    def XXX(self, haystack: str, needle: str) -> int:
        lens = len(needle)
        if not lens:
            return 0
        for i in range(len(haystack)):
            if i+lens > len(haystack):
                return -1
            if haystack[i:i+lens] == needle:
                return i
        
        return -1

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

