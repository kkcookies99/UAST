 class Solution:
    def XXX(self, s: str) -> int:
        st={}
        x=0
        j=0
        for i in range(len(s)):
            if(s[i] in st):
                j=max(st[s[i]]+1,j)
            x=max(x,i-j+1)
            st[s[i]]=i
        return x

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

