class Solution:
    def XXX(self, s: str) -> int:
        s = s.strip()
        res = 0
        i = 0
        n = len(s)
        sign = 1
        max_num = 2**31-1
        min_num = -2**31
        if i < n :
            if s[i] == "-":
                sign = -1
                i += 1
            elif s[i] == "+":
                i += 1    
        while i < n and s[i].isdigit():
            #print(res)
            res = 10 * res + int(s[i])
            if res > max_num or res < min_num:
                if sign == 1:
                    return max_num
                else:
                    return min_num    
            i += 1
        return res * sign

