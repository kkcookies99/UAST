class Solution:
    def XXX(self, s: str) -> int:
        size = 0
        for i in range(len(s)-1, -1, -1):
            if s[i] == " ":
                if size != 0:
                    return size
            else:
                size += 1
        return size

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


