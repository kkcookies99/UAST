 class Solution:
    def XXX(self, digits: List[int]) -> List[int]:
        n = len(digits)
        add = 0
        digits[-1] +=1 
        if digits[-1] == 10:
            digits[-1]  = 0
            add = 1 
        for i in range(n-2,-1,-1):
            digits[i ] += add 
            if digits[i] == 10:
                digits[i]  = 0
                add = 1 
            else:
                add = 0 
        if add ==1 :
            digits.insert(0,1)

        return digits 

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


