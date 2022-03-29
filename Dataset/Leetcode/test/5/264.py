 class Solution:
    def XXX(self, s: str) -> str:
        if len(s) == 0:
            return ''
        if len(s) == 1:
            return s
        if len(s) == 2:
            return s if s[0]==s[1] else s[1]
        if len(s)>=3:
            x = x1 = x2 = 0
            for i  in range(1,len(s)):
                for j in range(0,min(i,len(s)-i)):     
                    if (s[i+j] == s[i-j-1]):
                        if ((2*j+2)>x) :
                            x1 = i-j-1
                            x2 = i+j
                            x = 2*j+2
                    else:
                        break
                if i>= 2:
                    for j in range(0,min(i,len(s)-i)): 
                        if (s[i+j] == s[i-j-2])&(i-j-2>=0):
                            if (2*j+3)>x:
                                x1 = i-j-2
                                x2 = i+j
                                x = 2*j+3
                        else:
                            break
            return s[x1:x2+1]
