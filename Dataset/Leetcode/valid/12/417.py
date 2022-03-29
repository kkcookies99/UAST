 class Solution(object):
    def XXX(self, num):
        """
        :type num: int
        :rtype: str
        """
        res=''
        N = ['M', 'CM', 'D', 'CD', 'C', 'XC', 'L', 'XL', 'X', 'IX', 'V', 'IV', 'I']
        n = [1000, 900, 500, 400,  100,  90,   50,  40,  10,   9,    5,   4,   1]
        for i in range(len(N)):
            while( num >=n[i]):
                res += N[i]
                num -= n[i]
        return res


