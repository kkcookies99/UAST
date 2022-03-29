 class Solution:
    def XXX(self, str: str) -> int:
        import re
        str = str.lstrip()
        if re.match('\d+',str) or re.match('-\d+',str) or re.match('\+\d+',str):
            if re.match('\d+',str):
                str = re.match('\d+',str).group(0)
            if re.match('\+\d+',str):
                str = re.match('\d+',str[1:]).group(0)
            if re.match('-\d+',str):
                str = re.match('-\d+',str).group(0)
            res = int(str)
            if res<-2**31:
                return -2**31
            if res > 2**31-1:
                return 2**31 - 1
            return res
        return 0

