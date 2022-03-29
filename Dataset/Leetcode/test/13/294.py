class Solution:
    def XXX(self, s: str) -> int:
        m = [
                ['', 'M', 'MM', 'MMM'],
                ['', 'C', 'CC', 'CCC', 'CD', 'D', 'DC', 'DCC', 'DCCC', 'CM'],
                ['', 'X', 'XX', 'XXX', 'XL', 'L', 'LX', 'LXX', 'LXXX', 'XC'],
                ['', 'I', 'II', 'III', 'IV', 'V', 'VI', 'VII', 'VIII', 'IX']
            ]
        def roman2int(str):
            # 将罗马数字转成整数
            a = 0
            for j in range(4):
                for i in range(len(m[j])):
                    if m[j][i] == str:
                        a = i * 10**(3 - j)
            return a
        num = 0
        while s != "":
            for j in range(4, 0, -1):
                a = s[0:j]
                if (a in m[0]) or (a in m[1]) or (a in m[2]) or (a in m[3]):
                    num = roman2int(a) + num
                    break
            s = s.replace(a, "", 1)
        return num

