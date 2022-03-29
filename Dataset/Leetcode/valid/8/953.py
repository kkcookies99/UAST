 class Solution:
    def XXX(self, strs: str) -> int:
        str_strip_blank = strs.lstrip(' ')
        if not str_strip_blank:
            return 0

        valid_start = {'+': 0, '-': 0}
        valid_num = {'0': 0, '1': 0, '2': 0, '3': 0,
                     '4': 0, '5': 0, '6': 0, '7': 0, '8': 0, '9': 0}
        if str_strip_blank[0] not in valid_start and str_strip_blank[0] not in valid_num:
            return 0
        start = 0
        if str_strip_blank[0] in valid_start:
            start = 1

        index = 0
        for each in str_strip_blank[start:]:
            if each in valid_num:
                index += 1
            else:
                break
        if index:
            num = int(str_strip_blank[0:index+start])
            if num < -2147483648:
                return -2147483648
            elif num > 2147483647:
                return 2147483647
            return int(num)
        return 0

