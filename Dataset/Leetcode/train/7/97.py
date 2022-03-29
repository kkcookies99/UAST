class Solution:
    def XXX(self, x):
        if x>=0:
            x=int(str(x)[::-1])
        else:
            x=int('-'+str(x)[1:][::-1])
        if x<=2147483647 and x>=-2147483648:
            return x
        else:
            return 0

