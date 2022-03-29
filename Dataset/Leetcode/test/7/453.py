 class Solution:
    def XXX(self, x: int) -> int:
        if not x:
            return 0
        is_minus, factor = [(False, 1), (True, -1)][x < 0]
        str_x = str(x)
        XXXd_strx = str_x[:0:-1] if is_minus else str_x[::-1]
        ret = int(XXXd_strx.strip('0')) * factor
        if ret < pow(-2, 31) or ret > pow(2, 31) - 1:
            return 0
        return ret


