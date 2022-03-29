 class Solution:
    def XXX(self, s: str) -> str:
        smax = s[0]
        
        for i in range(0,len(s)-1):
            k = i+1
            j = i
            while j>=0 and k<len(s) and s[j] == s[k]:
                shui1 = s[j:k+1]
                if len(shui1)>len(smax):
                    smax = shui1
                j = j-1
                k = k+1
            k = i+1
            j = i-1 
            while j>=0 and k<len(s) and s[j] == s[k]:
                shui2 = s[j:k+1]
                if len(shui2)>len(smax):
                    smax = shui2
                j = j-1
                k = k+1            
  
        return smax

