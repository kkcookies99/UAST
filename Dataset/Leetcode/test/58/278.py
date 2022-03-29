 class Solution:
    def XXX(self, s: str) -> int:
        begin = False
        
        j = len(s)-1

        while j>=0 and s[j]==" ":
            j-=1
        
        ans = 0
        while j>=0 and s[j]!=" ":
            ans += 1
            j -= 1
        
        return ans

