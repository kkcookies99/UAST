class Solution(object):
    def XXX(self, a, b):
        """
        :type a: str
        :type b: str
        :rtype: str
        """
        m = len(a)
        n = len(b)
        if m!=n:
            if m>n:
                ca = m-n
                b = '0'*ca+b
            else:
                ca = n-m
                a = '0'*ca+a
        length = len(a)
        mid = 0
        string = ""
        for i in range(length-1,-1,-1):
            cont = int(a[i])+int(b[i])+mid
            if cont==1:
                mid = 0
                string = string+str(cont)
                continue
            elif cont == 0:
                mid = 0
                string =string+str(cont)
                continue
            else:
                mid = 1
                string = string +str(cont%2)
                continue
        if mid == 1:
            string = string + '1'
        return string[::-1]
            

