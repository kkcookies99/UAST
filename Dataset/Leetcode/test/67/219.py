 class Solution(object):
    def XXX(self, a, b):
        """
        :type a: str
        :type b: str
        :rtype: str
        """
        sum = int(a) + int(b)
        L = list(str(sum))
        for i in range(len(L)-1,0,-1):
            if int(L[i]) >= 2:
                L[i] = str(int(L[i])-2)
                L[i-1] = str(int(L[i-1])+1)
        if int(L[0]) >= 2:
           
            L[0] = str(10+int(L[0])-2)
        l = ""
        result = l.join(L)
        return result

