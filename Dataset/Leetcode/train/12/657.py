 class Solution:
    def XXX(self, num: int) -> str:
        res = ''
        dict_Romans = { 1000: 'M', 900: 'CM', 500: 'D', 400: 'CD', 100: 'C', 90: 'XC', 50: 'L', 40: 'XL',10: 'X', 9: 'IX', 5: 'V',4: 'IV', 1: 'I'}
        for key in dict_Romans:
            if num // key >= 1:
                res += dict_Romans[key] * (num // key)
                num = num % key
        return res

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

