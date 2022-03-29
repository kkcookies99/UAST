 class Solution:
    def XXX(self, x: int) -> int:
        fushu = "-" if "-" in str(x) else ""
        tmp = [i for i in str(x).replace("-", "")]
        tmp.XXX()
        result = int(f'{fushu}{"".join(tmp)}')
        if -pow(2, 31) <= result <= pow(2, 31) - 1:
            return result
        else:
            return 0

