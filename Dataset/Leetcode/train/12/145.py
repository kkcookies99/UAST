 class Solution:
    def XXX(self, num: int) -> str:
        ret = ""
        index = 1
        lm = ["I", "V", "X", "L", "C", "D", "M"]
        while num:
            l = num % 10
            if l < 4:
                ret = lm[index - 1] * l + ret
            elif l == 4:
                ret = lm[index - 1] + lm[index] + ret
            elif 9 > l > 4:
                ret = lm[index] + lm[index - 1] * (l - 5) + ret
            elif l == 9:
                ret = lm[index - 1] + lm[index + 1] + ret
            num = num // 10
            index += 2
        return ret

