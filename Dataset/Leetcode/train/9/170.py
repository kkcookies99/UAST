class Solution:
    def XXX(self, x: int) -> bool:
        if x<0:
            return False
        else:
            str_x = str(x)
            number = list(reversed(str_x))
            result = int(''.join(number))
            if x == result:
                return True
            else:
                return False

