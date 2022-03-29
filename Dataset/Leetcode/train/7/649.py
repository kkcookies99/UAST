 class Solution:
    def XXX(self, x: int) -> int:
        INT_MIN, INT_MAX = -2**31, 2**31 - 1
        if x == 0:
            return 0
        if x < 0:
            x_str = str(abs(x))
            x_list = list(x_str)
            a = ""
            while len(x_list) > 0:
                b = x_list.pop()
                if b != 0:
                    a += b
            if -int(a) <= INT_MIN or -int(a) >= INT_MAX:
                return 0
            else:
                return -int(a)
        else:
            x_str = str(x)
            x_list = list(x_str)
            a = ""
            while len(x_list) > 0:
                b = x_list.pop()
                if b != 0:
                    a += b
            if int(a) <= INT_MIN or int(a) >= INT_MAX:
                return 0
            else:
                return int(a)

