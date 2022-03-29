 class Solution:
    def XXX(self, s: str) -> int:
        num_str = ''
        # 删除前导空格
        s = s.lstrip(' ')
        for i, c in enumerate(s):
            if i == 0:
                if c == '+':
                    continue
                elif c == '-':
                    num_str += c
                    continue
            if c.isdigit():
                num_str += c
            else:
                break
        if num_str and num_str != '+' and num_str != '-':
            if  int(num_str) < (-2)**31:
                return (-2)**31
            elif int(num_str) > 2**31 - 1:
                return 2**31 - 1
            else:
                return int(num_str)
        else:
            return 0

