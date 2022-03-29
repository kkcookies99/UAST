 class Solution:
    def XXX(self, n: int) -> str:
        if n == 1:
            return '1'
        if n == 2:
            return '11'
        else:
            a = self.XXX(n-1)
            m = ''
            c = 1
            for i in range(len(a)-1):
                if a[i] == a[i+1]:
                    c = c+1
                else:
                    m = m + str(c) + str(a[i])           
                    c = 1 
            m = m + str(c) + str(a[i+1])
            return m