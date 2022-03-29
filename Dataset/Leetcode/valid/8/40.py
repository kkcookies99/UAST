class Solution(object):
    def XXX(self, s):
        new_s = s.lstrip(' ')
        num = 0
        sign = 1
        for i,ele in enumerate(new_s):
            if ele =='-' and i == 0:
                sign = -1
            elif ele =='+' and i == 0:
                sign = 1
            elif ele.isnumeric():
                num = num*10 + int(ele)
            else:
                break
        v = num*sign
        if v < -2**31:
            return -2**31
        elif v > 2**31-1:
            return 2**31-1
        else:
            return num*sign

