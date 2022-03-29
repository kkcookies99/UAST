 class Solution(object):
    def XXX(self, str):
        """
        :type str: str
        :rtype: int
        """
        
        length = len(str)
        if length == 0:
            return 0
        
        # 寻找第一个有效字符
        for i in range(length):
            if str[i] == " ":
                continue
            else:
                break
        
        # 根据第一个有效字符确认数字符号
        res = ''
        begin = str[i]
        sign = 1
        if begin.isdigit():
            res += begin
        else:
            if begin == "-":
                sign = -1
            elif begin == "+":
                sign = 1
            else:
                return 0
        
        # 后续拼接
        for j in range(i + 1, length):
            if str[j].isdigit():
                res += str[j]
            else:
                break
                
        if res == '':
            return 0
        
        res = int(res) * sign
        if res > 2**31 - 1:
            return 2**31 - 1
        elif res < -(2**31):
            return -(2**31)
        else:
            return res

