 class Solution:
    def XXX(self, num: int) -> str:
        if num>3999 or num <1:
            return 0 
        
        ret = ""
        lable = [1000,900,500,400,100,90,50,40,10,9,5,4,1]
        roma =  ["M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"]
      
        
        for i in range(len(lable)):
            if num//lable[i]:
                ret += roma[i]*(num//lable[i])
                num %= lable[i]
        return ret

