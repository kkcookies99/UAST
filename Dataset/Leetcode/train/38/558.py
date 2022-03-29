 class Solution:
    def XXX(self, n: int) -> str:
        if n == 1:
            return '1'
        a = '1'
        while n > 1:
            m = ''
            c = 1
            for i in range(len(a) - 1):
                if a[i] == a[i + 1]:
                    c = c + 1
                else:
                    m = m + str(c) + str(a[i])
                    c = 1
            a = m + str(c) + str(a[-1])
            n = n - 1
        return a

