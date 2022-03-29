 class Solution:
    def XXX(self, strs: str) -> int:
        import re
        str_strip_blank = strs.lstrip(' ')
        if not str_strip_blank:
            return 0
        num_str = re.search(r'^[-+]?\d+', str_strip_blank)
        if num_str:
            num = int(num_str.group())
            if num < -2147483648:
                return -2147483648
            elif num > 2147483647:
                return 2147483647
            return int(num)
        return 0

