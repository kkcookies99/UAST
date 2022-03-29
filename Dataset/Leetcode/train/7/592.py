 class Solution(object):
    def XXX(self, x):
        """
        :type x: int
        :rtype: int
        """
        max1=2**31-1
        min1=-2**31
        n=0
        if x>=0:
            while x!=0:
                n=n*10+x%10
                x=x/10
            if n<=max1:
                return n
            else:
                return 0
        else:
            x=-x
            while x!=0:
                n=n*10+x%10
                x=x/10
            if -n>min1:
                return -n
            else:
                return 0

