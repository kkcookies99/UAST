class Solution(object):
    def XXX(self, x):
        """
        :type x: int
        :rtype: int
        """
        x = str(x)
        if x[0]=="-":
            result=int(x[::-1][0:-1])*-1
        else:
            result=int(x[::-1])
        return result

