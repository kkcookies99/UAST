 class Solution:
    def XXX(self, s: str) -> bool:
        n = len(s)
        i = 0
        j = n - 1
        while i < j:
            
            while i < j and not (s[i].isalnum()):
                i = i + 1
            while i < j and not (s[j].isalnum()):
                j = j - 1

            c1 = s[i].lower()
            c2 = s[j].lower()
            if c1 != c2:
                return False
            i = i + 1
            j = j - 1
            
        return True

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


