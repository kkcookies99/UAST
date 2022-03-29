 class Solution:
    def XXX(self, num: int) -> str:
        qian = num // 1000
        bai = (num // 100) % 10
        shi = (num // 10) % 10
        ge = num % 10
        qian1 = ["", "M", "MM", "MMM"]
        bai1 = ["", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"]
        shi1 = ["", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"]
        ge1 = ["", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"]

        ret = qian1[qian]
        ret += bai1[bai]
        ret += shi1[shi]
        ret += ge1[ge]
        return ret

