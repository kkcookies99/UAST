 class Solution(object):
    def XXX(self, str):
        """
        :type str: str
        :rtype: int
        """
        INT_MIN = -2**31
        INT_MAX = 2**31-1
        
        import re
        res = re.findall(r"^[\+\-]?\d+",str.strip())

        if res !=[]:
            if int(res[0]) > (2**31-1):
                return INT_MAX
            if int(res[0]) < (-2**31):
                return INT_MIN
            return int(res[0])
        else:
            return 0

