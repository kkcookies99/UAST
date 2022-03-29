 class Solution:
    def XXX(self, x: int) -> int: 
        s = str(x)
        if s[0] == '-' :
            s = int('-' + ''.join(s[1:][::-1]))
        else:
            s = int(''.join(s[::-1]))
        if s in range(-2**31,2**31-1):
            return s
        else: 
            return 0

