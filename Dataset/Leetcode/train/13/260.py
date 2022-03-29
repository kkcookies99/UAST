class Solution:
    def XXX(self, s):
        """
        :type s: str
        :rtype: int
        """
        roman_dict = {
            'I':1,
            'V':5,
            'X':10,
            'L':50,
            'C':100,
            'D':500,
            'M':1000
        }
        result = 0
        i = 1
        while 1:
            if i == len(s)+1:
                break
            if (s[-i] == 'V' or s[-i] == 'X') and i != len(s):
                if s[-i-1] == 'I':
                    result += (roman_dict[s[-i]] - roman_dict[s[-i-1]])
                    i += 2
                    continue
            if (s[-i] == 'L' or s[-i] == 'C') and i != len(s):
                if s[-i-1] == 'X':
                    result += (roman_dict[s[-i]] - roman_dict[s[-i-1]])
                    i += 2
                    continue
            if (s[-i] == 'D' or s[-i] == 'M') and i != len(s):
                if s[-i-1] == 'C':
                    result += (roman_dict[s[-i]] - roman_dict[s[-i-1]])
                    i += 2
                    continue
            result += roman_dict[s[-i]]
            i += 1
        return result

