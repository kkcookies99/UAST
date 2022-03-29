 class Solution:
    def XXX(self, a: str, b: str) -> str:
        result = ""

        if len(a)< len(b):
            a = a.zfill(len(b))
        else:
            b = b.zfill(len(a))
        print(a)
        print(b)
        tmp = 0 
        for i in range(len(a)-1, -1, -1):
            if int(a[i]) + int(b[i]) == 0:
                if tmp == 0:
                    result = result + '0'
                    tmp = 0
                else:
                    result = result + '1'
                    tmp = 0

            elif int(a[i]) + int(b[i]) == 1:
                if tmp == 0:
                    result = result + '1'
                    tmp = 0 
                else:
                    result = result + '0'
                    tmp = 1 

            elif int(a[i]) + int(b[i]) == 2:
                if tmp ==0 :
                    result = result + '0'
                    tmp = 1 
                else:
                    result = result + '1'
                    tmp = 1 
        if tmp == 1:
            result = result + '1'
        return result[::-1]

