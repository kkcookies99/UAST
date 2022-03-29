 class Solution:
    def XXX(self, n: int) -> List[str]:
        self.res=[]
        self.helper(0,0,'',0,n)
        return self.res

    def helper(self,i,count,temp,l,n):
        if count==2*n:
            self.res.append(temp)
            return 
        if l==n:
            self.helper(i-1,count+1,temp+')',l,n)
        elif i==0:
            self.helper(i+1,count+1,temp+'(',l+1,n)
        else:
            self.helper(i+1,count+1,temp+'(',l+1,n)
            self.helper(i-1,count+1,temp+')',l,n)

