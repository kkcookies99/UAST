  def XXX(self, s: str) -> bool:
        s=s.lower()
        s=re.sub('[^a-z0-9]','',s)
        n=len(s)//2
        if len(s)%2==0:
            return s[:n]==s[n:][::-1]
        else:
            return s[:n]==s[n+1:][::-1]

