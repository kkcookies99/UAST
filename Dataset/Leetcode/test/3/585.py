 class Solution:
    def XXX(self, s: str) -> int:
        l=0
        r=1
        maxSub=0
        while r<=len(s):
            if len(set(s[l:r]))==len(s[l:r]):
                maxSub=max(maxSub,len(set(s[l:r])))
                r+=1               
            else:
                l+=1

        return maxSub``

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


