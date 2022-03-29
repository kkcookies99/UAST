 class Solution:
    def XXX(self, num: int) -> str:
        dict_1 = {1:'I',4:'IV',5:'V',9:'IX',10:'X',
                40:'XL',50:'L',90:'XC',100:'C',
                400:'CD',500:'D',900:'CM',1000:'M'}
        dict_ = [1000,900,500,400,100,90,50,40,10,9,5,4,1]
        re = ''
        for dit in dict_:
            while num >= dit:
                num -= dit
                re += dict_1[dit]
        return re

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


