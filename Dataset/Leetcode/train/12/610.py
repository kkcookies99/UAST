 class Solution:
    def XXX(self, num: int) -> str:
        arabic2roman = {
            1: "I", 4: "IV", 5: "V", 9: "IX",
            10: "X", 40: "XL", 50: "L", 90: "XC",
            100: "C", 400: "CD", 500: "D", 900: "CM",
            1000: "M"
        }
        ans = ''
        for arab in sorted(arabic2roman.keys(), reverse=True):
            ans += (num // arab) * arabic2roman[arab]
            num = num % arab
        return ans

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


