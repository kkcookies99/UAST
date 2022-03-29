class Solution:
    def XXX(self, str: str) -> int:
        c_int = {'0','1','2','3','4','5','6','7','8','9'}
        c_stx = {'+', '-'}
        str = str.strip()
        if not str or not str[0] in (c_int|c_stx):
            return 0
        if str[0] in c_stx:
            if len(str) < 2 or not str[1] in c_int:
                return 0
            start = 1
        else:
            start = 0
        end = start
        for i in range(start,len(str)):
            if not str[i] in c_int:
                break
            end += 1
            
        res_abs = int(str[start:end])
        
        return max(-res_abs, -2147483648) if str[0] == '-' else min(res_abs, 2147483647)

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

