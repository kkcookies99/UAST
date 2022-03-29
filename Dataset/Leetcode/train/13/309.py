class Solution:
    def XXX(self, s: str) -> int:
        index = 0
        num = 0
        s += 'I'
        while index < len(s)-1:
            if s[index] == 'M':
                num += 1000
            elif s[index] == 'D':
                num += 500
            elif s[index] =='C':
                if s[index+1] == 'D'or s[index+1] == 'M':
                    num -= 100
                else:
                    num += 100
            elif s[index] == 'L':
                num += 50 
            elif s[index] =='X' :
                if s[index+1] == 'L'or s[index+1] == 'C':
                    num -= 10
                else:
                    num += 10
            elif s[index] == 'V':
                num += 5
            elif s[index] =='I':
                if s[index+1] == 'V'or s[index+1] == 'X':
                    num -= 1
                else:
                    num += 1
            index += 1
        return num

