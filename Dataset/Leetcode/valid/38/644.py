 class Solution(object):
    def XXX(self, n):
        def discribe(n):
            # a 个 b
            ans = ''
            b = n[0]
            a = 1
            for i in range(1,len(n)):
                if n[i]==n[i-1]:
                    a += 1
                else:
                    ans = ans + str(a) + b
                    b = n[i]
                    a = 1
            ans = ans + str(a) + b
            return ans
        if n == 1:
            return '1'
        if n==2:
            return '11'
        nn = '11'
        flag = 2
        while flag < n:
            nn = discribe(nn)
            flag += 1
        return nn

