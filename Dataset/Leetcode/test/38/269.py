class Solution:
    def XXX(self, n: int) -> str:
        if n == 1: return '1'
        a = self.XXX(n-1)
        j = 0
        b = ''
        for i in range(len(a)-1):
            if a[i] != a[i+1] :
                b += str(i-j+1) + str(a[j])
                j = i+1
        b += str(len(a)-j) + str(a[j])
        return b

