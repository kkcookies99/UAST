class Solution(object):
    def XXX(self, s):
        """
        用消除法解这道题目
        :type s: str
        :rtype: int
        """
        d = {'I': 1, 'V': 5, 'X': 10, 'L': 50, 'C': 100, 'D': 500, 'M': 1000, 'IV': 4, 'IX': 9, 'XL': 40, 'XC': 90,
             'CD': 400, 'CM': 900}
        sum = 0
        while len(s) > 0:
            ss = s[0:2]
            if ss in d:
                sum += d.get(ss)
                s = s[2:]
            else:
                sum += d.get(s[0:1])
                s = s[1:]
        return sum

