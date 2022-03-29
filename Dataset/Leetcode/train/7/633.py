 class Solution:
    def XXX(self, x: int) -> int:
        INT_MIN, INT_MAX = -2**31, 2**31 - 1
        if str(x).startswith('-'):
            y = -int(str(x)[1:][::-1])
        else:
            y = int(str(x)[::-1])
        
        if (y < INT_MIN or y > INT_MAX):
            return 0
        return y

