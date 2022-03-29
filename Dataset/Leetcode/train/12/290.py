 class Solution:
    def XXX(self, num: int) -> str:
        dict = {1:'I',4:'IV',5:'V',9:'IX',10:'X',40:'XL',50:'L',90:'XC',100:'C',400:'CD',500:'D',900:'CM',1000:'M'}
        ans = ''
        while num:
            for i in range(len(dict)-1,-1,-1):
                key = list(dict.keys())[i]
                ans += dict[key]*(num//key)
                num = num%key
        return ans

