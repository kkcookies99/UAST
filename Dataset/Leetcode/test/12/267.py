 class Solution:
    def XXX(self, num: int) -> str:
        d = {1:"I", 5:"V", 10:"X", 50:"L", 100:"C", 500:"D", 1000:"M"}
        multiple = 1
        res = ""
        while num:
            cur = num % 10
            if cur < 4:
                res = cur*d[multiple] + res
            elif cur == 4:
                res = d[multiple] + d[5*multiple] + res 
            elif cur < 9:
                res = d[5*multiple] + (cur - 5)*d[multiple] + res
            else:
                res = d[multiple] + d[10*multiple] + res
            multiple *= 10
            num //= 10
        return res

