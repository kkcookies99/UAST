 class Solution(object):
    def XXX(self, str):
        nospacestr = str.lstrip()
        if len(nospacestr) == 0:
            return 0
        iszhengfu = lambda char:char is '+' or char is '-'
        if iszhengfu(nospacestr[0]) or nospacestr[0].isdigit():
            length = 0
            while length + 1 < len(nospacestr) and nospacestr[length + 1].isdigit():
                length += 1
            numberstring = nospacestr[:length+1]
            realnumber = 0
            if len(numberstring) == 1:
                if numberstring[0].isdigit():
                    realnumber = int(numberstring[0])
                else: return 0
                return realnumber
            else:
                if numberstring[0] is '+':
                    realnumber = int(numberstring[1:])
                elif numberstring[0] is '-':
                    realnumber = -int(numberstring[1:])
                else:
                    realnumber = int(numberstring)
                if realnumber < -pow(2, 31):
                    realnumber = -pow(2, 31)
                if realnumber > pow(2, 31)-1:
                    realnumber = pow(2, 31)-1
                return realnumber
        else: return 0

