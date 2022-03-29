 class Solution:
    def XXX(self, haystack: str, needle: str) -> int:
        if needle == "":
            return 0
        for i in range(len(haystack) - len(needle) + 1):
            for j in range(len(needle)):
                if haystack[i + j] != needle[j]:
                    break
            else:
                return i
        return -1

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


