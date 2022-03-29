 class Solution:
    def XXX(self, x: int) -> int:
        str_x = str(x)
        r = ""
        for j in range(len(str_x) - 1, -1, -1):
            if str_x[j] != "-":
                r += str_x[j]
            else:
                r = str_x[j] + r
        
        new_r = int(r)

        if new_r >= -2**31 and new_r <= 2**31 - 1:
            return new_r
        else:
            return 0

