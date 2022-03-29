class Solution:
    def XXX(self, s: str) -> int:
        num = ['1','2','3','4','5','6','7','8','9','0']
        re = ''
        flag = 0          
        for i in s:
            if i == ' ':
                if flag == 1:
                    break 
                re = re
            elif i == '-' or i == '+':
                if flag == 1:
                    break 
                re = re+i
                flag = 1
            elif i in num:
                re = re+i
                flag = 1 
            else:
                break 
        if len(re) == 0:
            return 0
        if len(re) ==1 and re[0] in ['-','+']:
            return 0
        if len(re) ==2 and re[0] in ['-','+'] and re[1] in ['-','+']:
            return 0
        if len(re) > 2 and re[0] in ['-','+'] and re[1] in ['-','+']:
            return 0
        return min(max(int(re),-2**31),2**31-1)

