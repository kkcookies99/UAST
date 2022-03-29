 class Solution:
    def XXX(self, s: str) -> int:
        l1 = [1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1]
        l2 = ['M', 'CM', 'D', 'CD', 'C', 'XC', 'L', 'XL', 'X', 'IX', 'V', 'IV', 'I']
        num = 0
        for i in range(len(l2)):
            while l2[i] == s[:len(l2[i])]:
                s = s[len(l2[i]):]
                num += l1[i]
        return num

