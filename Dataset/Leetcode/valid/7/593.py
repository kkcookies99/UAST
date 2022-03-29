 class Solution(object):
    def XXX(self, x):
        """
        :type x: int
        :rtype: int
        """
        x=str(x)
        if x[0]=='-':
            txt='-'
            for i in range(len(x)-1,0,-1):
                txt+=x[i]
        else:
            txt=''
            for i in range(len(x)-1,-1,-1):
                txt+=x[i]
        if int(txt)<2147483647 and int(txt)>(-2147483648):
            return int(txt)
        else:
            return 0
