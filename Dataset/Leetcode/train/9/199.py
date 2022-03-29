class Solution:
    def XXX(self, x: int) -> bool:
        if(x<0):
            return False
        else:
            a = str(x)
            b = []
            c = []
            n = len(a)
            if(len(a)%2 == 0):
                for i in range(0 , len(a)//2):
                    b.append(a[i])
                    c.append(a[i+(len(a)//2)])
                if(b[::-1] == c):
                    return True
                else:
                    return False

            if(len(a)%2 == 1):
                for i in range(0 , len(a)//2):
                    b.append(a[i])
                    c.append(a[i+(len(a)//2)+1])
                if(b[::-1] == c):
                    return True
                else:
                    return False



