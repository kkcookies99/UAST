 class Solution:
    def XXX(self, s: str) -> int:
        i, j = 0, 0 
        res = 0
        while(j<len(s)):    
            while(s[j] in s[i:j]):
                i+=1
            res = max(res, j-i+1)
            j+=1
        return res

