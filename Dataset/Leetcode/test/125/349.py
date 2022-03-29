 def XXX(self, s: str) -> bool:
        s=s.lower()
        s=re.sub('[^a-z0-9]','',s)
        i,j=0,len(s)-1
        while j>i:
            if s[i]!=s[j]:
                return False
            i+=1
            j-=1
        return True

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


