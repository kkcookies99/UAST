class Solution:
    def XXX(self, a: str, b: str) -> str:
        if a == b and a == "0":
            return "0"
        
        res = 0

        tmp = len(a)
        for i in range(len(a)):
            tmp -= 1
            res += int(a[i]) * pow(2, tmp)
        
        tmp = len(b)
        for i in range(len(b)):
            tmp -= 1
            res += int(b[i]) * pow(2, tmp)
        
        res_s = str()
        while res != 1:
            res_s += str(res % 2)
            res //= 2
        res_s += "1"

        return res_s[::-1]

