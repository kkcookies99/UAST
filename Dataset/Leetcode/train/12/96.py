 class Solution:
    def __init__(self):
        self.prefix = {1:'I',4:'IV',5:'V',9:'IX',10:'X',40:'XL',50:'L',90:'XC',100:'C',400:'CD',500:'D',900:'CM',1000:'M'}
    def XXX(self, num: int) -> str:
        for i in list(self.prefix.keys())[::-1]:
            if i <= num :
                return self.prefix[i] + self.XXX(num-i)
        return ''

