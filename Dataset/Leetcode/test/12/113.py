 class Solution:
    def XXX(self, num: int) -> str:
        s = list(str(num))
        numbers =[["","I","II","III","IV","V","VI","VII","VIII","IX"],["","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"],["","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"],["","M","MM","MMM","","","","","",""]]
        ss = ""
        for i in range(len(s)):
            ss = numbers[i][int(s[-(i+1)])] + ss
        return ss

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


