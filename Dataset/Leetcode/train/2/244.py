class Solution:
    def addTwoNumber(self,l1,l2):
        a=0
        b=0
        for index,item in enumerate(l1):
            a=a+item*(10**index)
        for index,item in enumerate(l2):
            b=b+item*(10**index)
        c=a+b
        c=list(str(c))
        c1=[]
        while True:
            lastValue=c[-1]
            c1.append(lastValue)
            del c[-1]
            if len(c)==0:
                break
        return c1

