 class Solution:
    def XXX(self, num: int) -> str:
        res = ""
        val = [1000,900,500,400,100,90,50,40,10,9,5,4,1]
        rep = ["M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"]
        for i in range(0, len(val)):
            if num >= val[i]:
                res += int(num / val[i]) * rep[i];
                num = num - int(num / val[i]) * val[i]
        return res

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


