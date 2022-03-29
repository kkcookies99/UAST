 class Solution(object):
    def XXX(self, s):
        be = ['-', '+']
        num = ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9']
        ret = ""
        if s[0] == ' ':
            s = s[1:]
        if s[0] not in be + num:
            ret = '0'
        else:
            if s[0] in be:
                ret = s[0]
                s = s[1:]

            for i in s:
                if i in num:
                    ret += i
                else:
                    break
        data = int(ret)
        if data < -2**31:
            data = -2**31
        if data > 2**31 - 1:
            data = 2**31 - 1
        return data

