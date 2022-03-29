 class Solution:
    def XXX(self, n: int) -> str:
        if n == 1:
            return '1'
        a = self.XXX(n-1)
        m = ''
        c = 1
        for i in range(len(a)-1):
            if a[i] == a[i+1]:
                c = c+1
            else:
                m = m + str(c) + str(a[i])           
                c = 1 
        m = m + str(c) + str(a[-1])
        return m

