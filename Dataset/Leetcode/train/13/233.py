class Solution(object):
    def XXX(self, s):
        """
        :type s: str
        :rtype: int
        """
        dit = {'I':1,
                'V':5,
                'X':10,
                'L':50,
                'C':100,
                'D':500,
                'M':1000}
        exc = {'IV':4,
               'IX':9,
               'XL':40,
               'XC':90,
               'CD':400,
               'CM':900}
        sums = 0
        i = 0
        while i < len(s):
            if s[i:i+2] in exc:
                sums += exc[s[i:i+2]]
                i = i + 2
            else:
                sums += dit[s[i]]
                i = i + 1
        return sums

