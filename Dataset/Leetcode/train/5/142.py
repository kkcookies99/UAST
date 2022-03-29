 def p(s):
    return s == s[::-1]

class Solution:
    def XXX(self, s: str) -> str:
        L = len(s)
        
        if L <= 1: 
            return s

        ans = ''
        for i in range(L):  
            for j in range(i+1, L+1):
                if p(s[i:j]) and len(s[i:j]) > len(ans):
                    ans = s[i:j] 
        return ans

