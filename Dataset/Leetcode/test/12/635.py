 class Solution:
    def XXX(self, num: int) -> str:
        maps = {1000:'M',900:'CM',500:'D',400:'CD',100:'C',90:'XC',50:'L', 40:'XL', 10:'X',9: 'IX', 5:'V', 4:'IV',1:'I'}
        roman = ''
        for key,value in maps.items():
            count = num//key
            roman += value * count
            num -= count*key
        return roman

