class Solution:
    def XXX(self, n: int) -> str:
        if n==1:
            return '1'
        elif n==2:
            return '11'
        x=self.XXX(n-1)
        y=''
        count=1
        for i in range(len(x)):
             
            if i<len(x)-1 and x[i+1]==x[i]:
                count+=1
            else:
                y+=str(count)
                y+=str(x[i])
                count=1
        return y
            

