 class Solution:
    def XXX(self, s: str) -> str:
        ans = " " 
        s1 = s[::-1]
        if len(s) == 1 or ((len(s)==2)and (s[0]!=s[1])):
            ans = s[0]
        else:
            for i in range(0, len(s)):
                if s[i]==s1[i]:
                    ans =ans + s[i]
        return ans

