class Solution(object):
    def B2D(self, a):
        s=0
        for index,i in enumerate(a[::-1]):
            s+=(2**index)*int(i)
        return s

    def XXX(self, a, b):
        """
        :type a: str
        :type b: str
        :rtype: str
        """
        k1 = self.B2D(a)
        k2 = self.B2D(b)
        s = k1 + k2
        if s == 0:
            return "0"
        k=''
        while int(s/2)>0:
            k+=str(s%2)
            s=int(s/2)
        if s == 1:
            k+=str(s)
        return k[::-1]

