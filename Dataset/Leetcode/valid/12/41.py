 class Solution:
    def XXX(self, num: int) -> str:
        dic = {
            5000: "",
            1000: "M",
            900: "CM",
            500: "D",
            400: "CD",
            100: "C",
            90: "XC",
            50: "L",
            40: "XL",
            10: "X",
            9: "IX",
            5: "V",
            4: "IV",
            1: "I",
        }
        ret = ""

        for ws in (1000, 100,10,1):
            w = num // ws * ws
            num %= ws
            if w in dic.keys(): ret += dic[w]
            else: 
                ret += dic[ws*5] * (w // (ws*5)) + dic[ws] * (w//ws%5)

        return ret

