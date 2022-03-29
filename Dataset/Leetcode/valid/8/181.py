class Solution:
    def XXX(self, str: str) -> int:
        reg = re.compile(r"^\s*[+-]?\d+")
        a = reg.findall(str)
        if a:
            retu = a[0].strip()
            retu = int(retu)
        else:
            return 0
        if retu < -2**31:
            return -2**31
        if retu > 2**31 - 1:
            return 2**31 - 1
        else:
            return retu

