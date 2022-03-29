 class Solution(object):
    def XXX(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        l = len(digits)
        r = l-1
        n = 0
        for i in range(0,l):
            n = n + digits[i] * (10**r)
            r= r-1
        
        n = n+1
        return [int(x) for x in str(n)]

