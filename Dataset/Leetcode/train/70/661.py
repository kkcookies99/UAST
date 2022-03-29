class Solution(object):
    def XXX(self, n):
        """
        :type n: int
        :rtype: int
        """
        if n==1:
            return 1
        if n==2:
            return 2
        tmp=[0]*(n+1)
        tmp[1]=1
        tmp[2]=2
        for i in range(3,n+1,1):
            tmp[i]=tmp[i-1]+tmp[i-2]
        return tmp[-1]

