 class Solution:
    def XXX(self, s: str) -> bool:
        if not s:
            return True
        
        s = s.lower()
        p, q = 0, len(s) - 1
        
        while p < q:
            if not s[p].isdigit() and not s[p].isalpha():
                p += 1
            elif not s[q].isdigit() and not s[q].isalpha():
                q -= 1
            elif s[p] == s[q]:
                p += 1
                q -= 1
            else:
                return False
        
        return True

