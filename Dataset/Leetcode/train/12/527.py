 class Solution:
    def XXX(self, num: int) -> str:
        string = ""
        number = num
        while number > 0:
            if number >= 1000:
                number -= 1000
                string += "M"
            elif number >= 900:
                number -= 900
                string += "CM"
            elif number >= 500:
                number -= 500
                string += "D"
            elif number >= 400:
                number -= 400
                string += "CD"
            elif number >= 100:
                number -= 100
                string += "C"
            elif number >= 90:
                number -= 90
                string += "XC"
            elif number >= 50:
                number -= 50
                string += "L"
            elif number >= 40:
                number -= 40
                string += "XL"
            elif number >= 10:
                number -= 10
                string += "X"
            elif number >= 9:
                number -= 9
                string += "IX"
            elif number >= 5:
                number -= 5
                string += "V"
            elif number >= 4:
                number -= 4
                string += "IV"
            elif number >= 1:
                number -= 1
                string += "I"
        return string

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


