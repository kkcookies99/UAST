 class Solution:
    def XXX(self,x):
        xx=x
        y=1
        if x<0:
            xx=-x
            y=-1
        list1=int(str(xx)[::-1])*y
        cc=0 if list1<-(2**31-1) or list1>2**31 else list1
        return cc

