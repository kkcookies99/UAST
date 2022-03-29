 class Solution:
    def XXX(self, s: str) -> int:
        a = 0
        va = [1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1]
        re = ["M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"];
        for i in range(0, 13):
            tmp = s[0:len(re[i])]
            while tmp == re[i] and len(s) > 0:
                a += va[i]
                s = s[len(re[i]):]
                tmp = s[0:len(re[i])]
        return a

