 class Solution(object):
    def XXX(self, str):
        """
        :type str: str
        :rtype: int
        """
        str = str.strip()
        if not str:
            return 0
        res = 0
        j = 0
        if not str[0].isdigit() and str[0] != '+' and str[0] !='-':
            return 0
        if str[0] == '+' or str[0] == '-':
            j = 1
        for i in range(j, len(str)):
            if str[i].isdigit(): 
                res = res*10 + int(str[i])
            else:
                break
        if str[0] == '-':
            res = -res
        res = min(res, 2**31 - 1)
        res = max(res, -2**31)
        return res

