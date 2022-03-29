 class Solution:
    def XXX(self, s: str) -> int:
        s = s.strip()
        res, flag = 0, 1
        for i, v in enumerate(s):
            if v.isnumeric():
                res = int(v) + res * 10
            elif i == 0 and v == '-':
                flag = -1
            elif i == 0 and v == '+':
                flag = 1
            else:
                break
        
        if res * flag <= -2147483648:
            return -2147483648
        elif res * flag >= 2147483647:
            return 2147483647
        else:
            return res * flag

