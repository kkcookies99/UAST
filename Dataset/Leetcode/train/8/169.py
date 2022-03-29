class Solution:
    def XXX(self, str: str) -> int:
        str = str.lstrip()
        if len(str) == 0:
            return 0
        i = 0
        if str[0] == "-" or str[0] == "+":
            i = 1
        if len(str[i:]) == 0 or not str[i].isdecimal():
            return 0
        i += 1
        while i < len(str):
            if not str[i].isdecimal():
                break
            i += 1
        str = int(str[:i])
        if str < -2147483648:
            return -2147483648
        if str > 2147483647:
            return 2147483647
        return str

