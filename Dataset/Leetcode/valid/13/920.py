 class Solution(object):
    def XXX(self, s):
        """
        :type s: str
        :rtype: int
        """
        num_rome = {'I': 1, 'V': 5, 'X': 10, 'L': 50, 'C': 100, 'D': 500, 'M': 1000}
        output = 0
        sign = 0
        leng_s = len(s)
        for i, s_ in enumerate(s):
            if sign == 0:
                if s_ == 'I':
                    if i+1 < leng_s and s[i+1] == 'V':
                        output += 4
                        sign = 1
                    elif i+1 < leng_s and s[i+1] == 'X':
                        output += 9
                        sign = 1
                    else:
                        output += 1
                elif s_ == 'X':
                    if i+1 < leng_s and s[i+1] == 'L':
                        output += 40
                        sign = 1
                    elif i+1 < leng_s and s[i+1] == 'C':
                        output += 90
                        sign = 1
                    else:
                        output += 10
                elif s_ == 'C':
                    if i+1 < leng_s and s[i+1] == 'D':
                        output += 400
                        sign = 1
                    elif i+1 < leng_s and s[i+1] == 'M':
                        output += 900
                        sign = 1
                    else:
                        output += 100
                else:
                    output += num_rome[s_]
            else:
                sign = 0
        return output```

