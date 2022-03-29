class Solution(object):
    def XXX(self, s):
        
        length = len(s)
        result = ""
        for index in range(length):
            if s[index].isnumeric(): # 是数字
                result += s[index]
            elif s[index] == ' ' :     # 是空格
                if result == "":
                    continue
                else:
                    break
            elif s[index] == '-' or s[index] == '+':  # 是正负号
                if result == "":
                    result += s[index]
                else:
                    break
            elif s[index].isalpha():    # 是字母
                break
            else:                             # 是其他符号
                break
        if result == '' or result == '+' or result == '-' or ('+' in result and '-' in result):
            int_result = 0
        else:
            int_result = int(result)

        if int_result > 2**31 -1:
            return 2**31 - 1
        elif int_result < -2**31:
            return -2**31
        else:
            return int_result

