 class Solution:
    def XXX(self, s: str) -> str:
        if s==s[::-1]:return s
       
        maxlen,middle=1,0
        i=1
        len_s=len(s)
        rev=s[0]
        if(s[0]==s[1]):
            rev=s[0:2]
            maxlen=2
        while i<len_s:
            if(maxlen%2!=0):
                odd=s[i-maxlen//2-1:i+maxlen//2+2]
                even=s[i-maxlen//2:i+maxlen//2+2]
            else:
                odd=s[i-maxlen//2:i+maxlen//2+1]
                even=s[i-maxlen//2:i+maxlen//2+2]
            
            if (odd==odd[::-1]) and len(odd)>maxlen:
                rev=odd
                maxlen=len(odd)
                continue
            if(even==even[::-1] and len(even)>maxlen):
                maxlen=len(even)
                rev=even
                continue
            i+=1
        return rev

