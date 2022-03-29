 class Solution:
    def XXX(self, n: int) -> str:
        s="1"        
        for i in range(1,n):                
            s1,s2="",""            
            for k in range(0,len(s)): 
                if k==0:
                    s2,a=s[k],1                    
                else:
                    if s2!=s[k]:
                        s1,s2,a=s1+str(a)+s2,s[k],1                        
                    else:                        
                        a+=1
            s=s1+str(a)+s2
        return s

