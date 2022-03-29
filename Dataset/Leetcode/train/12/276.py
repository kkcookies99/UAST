 class Solution:
    def XXX(self, num: int) -> str:
        roman_dict = {"M":1000, "CM":900, "D":500, "CD":400, "C":100, "XC":90, 
        "L":50, "XL":40, "X":10, "IX":9, "V":5, "IV":4, "I":1}
        res = ""
        for key, value in roman_dict.items():
            count, num = divmod(num, value)
            res += key * count
        return res

