 class Solution:
    def XXX(self, s: str) -> int:
        roman = ['I', 'IV', 'V', 'IX', 'X', 'XL', 'L', 'XC', 'C', 'CD', 'D', 'CM', 'M']
        num =   [1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000]
        res = 0
        n = len(roman)
        j = 0
        m = len(s)
        for i in range(n - 1, -1, -1):
            r = roman[i]
            while j < m:
                # print(r, s[j], s[j + 1])
                if j + 1 < m and s[j] + s[j + 1] == r:
                    res += num[i]
                    j = j + 2
                elif s[j] == r:
                    res += num[i]
                    j = j + 1
                else:
                    break
        return res

