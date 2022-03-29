 class Solution:
    def XXX(self, s: str) -> int:
        s = s.strip()        
        if not s or not s[0].isdigit() and s[0] not in ["-","+"]:
            return 0
        flag=1
        result = 0        
        for i in range(len(s)):            
            if i == 0 and s[i]== "-":
                flag = -1
                continue
            elif i == 0 and s[i] == "+":
                result = 0
                continue            
            if s[i].isdigit():
                result = result*10 + int(s[i])
            else:
                break
        result*=flag
        if result > 2**31 - 1:
            return 2**31 - 1
        elif result < -2**31:
            return -2**31
        
        return result

