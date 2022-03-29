class Solution:
    def XXX(self, n):
        """
        :type n: int
        :rtype: int
        """
        cache = {}
        
        return self.__climb(n, cache)
    
    def __climb(self, n, cache):
        if n in cache:
            return cache[n]
        
        if n <= 2:
            return n
        
        cache[n] = self.__climb(n-1, cache) + self.__climb(n-2, cache)
        
        return cache[n]

