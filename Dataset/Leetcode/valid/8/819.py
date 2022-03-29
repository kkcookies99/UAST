 class Solution:
    def XXX(self, str: 'str') -> 'int':
        str = str.split()
        ret = ''
        flag = 1
        if len(str):
            str = str[0]
            if str[0] is '+':
                tmp = str[1:]
            elif str[0] is '-':
                tmp = str[1:]
                flag = -1
            elif str[0].isdigit():
                tmp = str
            else:
                return 0
            for x in tmp:
                if x.isdigit():
                    ret += x
                else:
                    break
            if not len(ret):
                return 0  
            ret = int(ret) * flag
            if -0x80000000 < ret < 0x80000000:
                return ret
            elif ret >= 0x80000000:
                return 0x80000000 - 1
            else:
                return -0x80000000
        else:
            return 0

