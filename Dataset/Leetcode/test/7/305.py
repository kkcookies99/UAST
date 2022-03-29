class Solution:
    def XXX(self, x: int) -> int:
        if x != 0:
            if x > 0:
                num = str(x)[::-1]
            else:
                num = '-' + str(-x)[::-1]
            num = int(num)
            return num if num < 2 ** 31 and num >= - 2 ** 31 else 0  
        return 0

