 def XXX(self, s: str) -> str:
    self.left,self.right=0,0
    self.maxlen=0
    def search(l,r):
        while l>=0 and r<len(s) and s[l]==s[r]:
            if r-l+1>self.maxlen:
                self.maxlen=r-l+1
                self.left=l
                self.right=r
            r+=1
            l-=1
    
    for i in range(len(s)):
        search(i,i)
        search(i,i+1)
    
    return s[self.left:self.right+1]

