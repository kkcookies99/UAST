 class Solution:
    def XXX(self, s: str) -> bool:
        if not s: return True
        s = s.upper()
        # 直接把非字母项都删了
        s = ''.join(list(filter(str.isalnum, s)))
        
        i = 0
        j = len(s) - 1

        while i < j:
            if s[i] != s[j]:
                return False
            else:
                i += 1
                j -= 1
        
        return True

