 class Solution(object):
    def XXX(self, x):
        """
        :type x: int
        :rtype: bool
        """
        if x<0:
            return False
        if x%10==x:
            return True
        i=0
        j=0
        while x//(10**j)!=0:
            j=j+1
        j=j-1       
        while i<j:
            x1=x//(10**i)%10
            x2=x//(10**j)%10
            if x1!=x2:
                return False
            i+=1
            j-=1
        return True

