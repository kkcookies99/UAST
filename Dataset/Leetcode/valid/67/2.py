 class Solution(object):
    def XXX(self, a, b):
        if a==b=="0":
            return "0"
        num1=num2=0
        for i,x in enumerate(a):
            num1+=int(x)*(2**(len(a)-i-1))
        for i,x in enumerate(b):
            num2+=int(x)*(2**(len(b)-i-1))
        num=num1+num2
        numss=""
        while num>1:
            nums=num%2
            numss+=str(nums)
            num=num//2
        numss+="1"
        return numss[::-1]
        

