 class Solution(object):
    def XXX(self, str):
        """
        :type str: str
        :rtype: int
        """
        INT_MAX = 2**31 - 1
        INT_MIN = -2**31
        str = str.lstrip()
        i = -1
        for j in range(len(str)):
            if str[j].isdigit() or j == 0 and str[j] in ["-","+"]:
                if j == len(str)-1:
                    i = j+1
            else:
                i = j
                break
        try:
            res = int(str[:i]) if i > 0 else 0
        except:
            res = 0
        if res < INT_MIN:
            res = INT_MIN
        if res > INT_MAX:
            res = INT_MAX
        return res

