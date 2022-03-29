 class Solution(object):
    def XXX(self, x): 
        res =int(str(x)[0]+str(x)[:0:-1]) if x<0 else int(str(x)[::-1])
        return res if -2147483648<res<2147483647 else 0

