 def XXX(self, s: str) -> bool:
        l=0
        r=len(s)-1
        s=s.lower()
        while l<r:
            while  l<len(s)-1 and  not s[l].isalnum():
                l+=1
            while r>0 and  not s[r].isalnum():
                r-=1
            if s[l]==s[r]:
                l+=1
                r-=1
            else:
                break
        
        return not l<r```

