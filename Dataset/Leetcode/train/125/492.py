 class Solution:
    def XXX(self, s: str) -> bool:
        for i in s:
            if not i.isalpha() and not i.isdigit():
                s = s.replace(i,'')
        s = s.lower()
        if(len(s)<=1):
            return True
        i=0
        j=len(s)-1
        while i<=j:
            if(s[i]!=s[j]):
                return False
            if(s[i]==s[j]):
                i=i+1
                j=j-1
        return True

