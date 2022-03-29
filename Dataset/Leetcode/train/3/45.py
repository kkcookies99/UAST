 class Solution:
    def XXX(self, s: str) -> int:
        last = {}
        start = 0
        ans = 0

        for i in range(len(s)):
            if s[i]  in last:
                start = max(start, last[s[i]]+1)
            
            last[s[i]] = i
            ans = max(ans, i-start+1)
        
        return ans

