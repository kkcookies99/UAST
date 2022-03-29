 class Solution:
    def XXX(self, x: int) -> int:
        array_num=[]
        for i in str(abs(x)):
            array_num.insert(0,i)
        if x<0:
            array_num.insert(0,'-')
        a=''.join(array_num)
        a=int(a)
        if a > 2147483647 or a < -2147483648:
            a=0
        return a

