 class Solution(object):
    def XXX(self, n):
        """
        :type n: int
        :rtype: str
        """
        def describe(s):
            n = len(s)
            res=''
            i=0
            p=0
            while i<n:
                if s[i]==s[p]:
                    i+=1
                else: 
                    res+=str(i-p)+str(s[p])
                    p=i
            res+=str(i-p)+str(s[p])
            return res
        if n==1: return '1'

        return describe(self.XXX(n-1))

