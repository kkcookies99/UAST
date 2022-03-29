 class Solution:
    def XXX(self, haystack: str, needle: str) -> int:
        if not needle:
            return 0
        cur = 0
        while cur <= len(haystack)-len(needle):
            if haystack[cur]==needle[0]:
                i = 0
                while i<len(needle) and haystack[cur+i]==needle[i]:
                    i+=1
                if i==len(needle):
                    return cur
            cur +=1
        return -1

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


