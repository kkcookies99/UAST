 class Solution:
    def XXX(self, num: int) -> str:
        x=num
        dict={1000:'M',900:'CM',500:'D',400:'CD',100:'C',90:'XC',50:'L',40:'XL',10:'X',9:'IX',5:'V',4:'IV',1:'I'}
        integ=[1000,900,500,400,100,90,50,40,10,9,5,4,1]
        ll=['' for _ in range (13)]
        result=''
        for index in range(13):
            ll[index]=x//integ[index]
            x-= ll[index]*integ[index]
            for _ in range(ll[index]):
                result+=dict[integ[index]]
                #print(ll[index],dict[integ[index]])
        return result

