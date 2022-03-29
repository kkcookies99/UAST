class Solution:
    def XXX(self, str: str) -> int:
        import re
        str = str.lstrip()
        if not str:
            return 0
        mat = re.match(pattern=r'^[-+]?\d+', string=str )
        if not mat:
            return 0
        else:
            span = mat.span()
            s = int(str[span[0]: span[-1]])
            if s < -2**31:
                return -2**31
            elif s > 2**31-1:
                return 2**31-1
            else:
                return s

