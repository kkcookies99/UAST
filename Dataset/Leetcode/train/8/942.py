 class Solution(object):
    def XXX(self, str):
        """
        :type str: str
        :rtype: int
        """
        number = '0123456789'
        sign = '+-'
        str = str.strip()
        if len(str) > 1:
            if str[0] not in sign and str[0] not in number:
                return 0
            try:
                integer = int(str)
                if integer < -2**31:
                    return -2**31
                if integer > 2**31-1:
                    return 2**31 - 1
                return integer
            except ValueError:
                string = str[0]
                i = 1
                while i < len(str):
                    if str[i] in number:
                        string += str[i]
                        i += 1
                    else:
                        break
                try:
                    if int(string) < -2**31:
                        return -2**31
                    if int(string) > 2**31-1:
                        return 2**31 - 1
                    return int(string)
                except ValueError:
                    return 0
        elif str == '' or str not in number:
            return 0
        else:
            return int(str) 

