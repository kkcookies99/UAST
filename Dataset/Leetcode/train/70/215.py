class Solution:
    def XXX(self, n):
        """
        :type n: int
        :rtype: int
        """
#       s[n] = s[n-1] + s[n-2]

#       爆了
        # if n <= 2:
        #     return n
        # return self.XXX(n-1) + self.XXX(n-2)

        if n <= 2:
            return n
        
        s = [1, 2]
        for i in range(2,n):
            s.append(s[i-1] + s[i-2])
        return s[n-1]

