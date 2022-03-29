 class Solution(object):
    def XXX(self, haystack, needle):

        if needle == "":
            return 0
        if haystack == "":
            return -1
        S1 = len(haystack)
        S2 = len(needle)

        for i in range(S1-S2+1):
            if haystack[i:i+S2] == needle:
                return i
        return -1



undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


