 class Solution:
    def XXX(self, num: int) -> str:
        values = [1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1]
        reps = ["M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"]
        roman_num = ''

        for i in range(13):
            while num >= values[i]:
                num -= values[i]
                roman_num += reps[i]
        return roman_num

