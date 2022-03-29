 class Solution:
    def XXX(self, s: str) -> int:  
        
        i,j,ans=0,0,0
        while(j<len(s)):
            if(s[j] not in s[i:j]):               
                ans=max(ans,j+1-i)
                j=j+1
            else:
                i=i+1
        return ans

