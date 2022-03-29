class Solution(object):
    def XXX(self, n):
        """
        :type n: int
        :rtype: int
        """
        look_up=[-1 for i in range(n+1)]
        def ways(n):
            if n==1: return 1
            if n==2: return 2
            if look_up[n]<0:
                look_up[n]=ways(n-1)+ways(n-2)
            return look_up[n]
        
        return ways(n)

