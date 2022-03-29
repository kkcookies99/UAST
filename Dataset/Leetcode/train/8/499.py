 class Solution:
    def XXX(self, s: str) -> int:
        nums = '0123456789'
        s = s.strip()
        start = 0
        flag = 1
        n = 0
        if len(s) < 1:
            return 0
        if s[0] in '+-':
            flag = -1 if s[0] == '-' else 1
            start = 1
        if len(s) - start == 0:
            return 0
        for i in range(start, len(s)):
            if s[i] in nums:
                n = int(s[i]) + n * 10
            else:
                break
        n = n * flag
        if n < -2 ** 31:
            n = -2 ** 31
        elif n > 2 ** 31 - 1:
            n = 2 ** 31 - 1
        return n

