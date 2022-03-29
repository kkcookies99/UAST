 class Solution:
    def XXX(self, num: int) -> str:
        Roman = ""
        while num >= 1000:
            Roman += 'M'
            num -= 1000
        if num >= 900:
            Roman += 'CM'
            num -= 900
        elif num >= 500:
            Roman += 'D'
            num -= 500
        elif num >= 400:
            Roman += 'CD'
            num -= 400
        while num >= 100:
            Roman += 'C'
            num -= 100
        if num >= 90:
            Roman += 'XC'
            num -= 90
        elif num >= 50:
            Roman += 'L'
            num -= 50
        elif num >= 40:
            Roman += 'XL'
            num -= 40
        while num >= 10:
            Roman += 'X'
            num -= 10
        if num >= 9:
            Roman += 'IX'
            num -= 9
        elif num >= 5:
            Roman += 'V'
            num -= 5
        elif num >= 4:
            Roman += 'IV'
            num -= 4
        while num >= 1:
            Roman += 'I'
            num -= 1               
        return Roman

