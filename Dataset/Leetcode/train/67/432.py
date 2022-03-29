class Solution(object):
    def XXX(self, a, b):
        lenth = len(a) - len(b)
        if lenth >= 0:
            d = ''
            for i in range(lenth):
                d += '0'
            b = d + b
        else:
            d = ''
            for i in range(-lenth):
                d += '0'
            a = d + a
        a = a[::-1]
        b = b[::-1]
        z = []
        j = 0
        for i in range(max(len(a), len(b))):
            c = int(a[i]) + int(b[i]) + j
            if c >= 2:
                z.append(c-2)
                j = 1
                if i == max(len(a), len(b))-1:
                    z.append(1)
            else:
                z.append(c)
                j = 0
        m = ''
        for j in z[::-1]:
            m += str(j)
        return m

