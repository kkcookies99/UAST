class Solution:
    def XXX(self, x: int) -> bool:
        str_x = str(x)
        if str_x[0] == '-':
            return False
        else:
            new_x = str_x[::-1]
            if new_x == str_x:
                return True
            return False

