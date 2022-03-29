 class Solution(object):
    def XXX(self, n):
        """
        :type n: int
        :rtype: str
        """
        if n == 1:
            return '1'
        else:
            s = self.XXX(n-1)
            p = s[0]
            i, t=0, 0
            s2=''
            n = len(s)
            while i<n:
                if p==s[i]:
                    t+=1
                    i+=1
                else:
                    s2 += (str(t)+p)
                    t = 0
                    p = s[i]
            s2 += (str(t)+s[-1])
            return s2

