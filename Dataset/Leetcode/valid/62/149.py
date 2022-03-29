 class Solution(object):   
    
    def XXX(self, m, n):        
        dp = dict()
        for i in xrange(m):
            for j in xrange(n):
                if i == 0 or j == 0:
                    dp[(i,j)] = 1
                else:
                    dp[(i,j)] = dp[(i-1,j)]+dp[(i,j-1)]
        
        return dp[(m-1,n-1)]

