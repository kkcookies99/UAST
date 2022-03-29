 class Solution:
    def XXX(self, a: str, b: str) -> str:
        if len(a)>len(b):
            a, b = b, a
        c = 0
        d = ['0' for i in range(len(b)+1)]
        for i in range(-1, -len(a)-1, -1):
            print('i=:',i)
            print(a[i],b[i],c)
            if int(a[i]) + int(b[i]) + c == 0: 
                d[i] = '0'
                c = 0 
                print('a')
            elif int(a[i]) + int(b[i]) + c == 1:
                d[i] = '1'
                c = 0 
                print('b')
                print(d)
            elif int(a[i]) + int(b[i]) + c == 2:
                d[i] = '0'
                c = 1 
                print('c')
                print(d)
            elif int(a[i]) + int(b[i]) + c == 3:
                # print('wrong')
                # print(int(a[i]),int(b[i]),c)
                d[i] = '1'
                c = 1
                print('d')
        # print(c)
        for i in range(-len(a)-1, -len(b)-1, -1):
            if int(b[i]) + c == 0:
                d[i] = '0'
                c = 0 
            if int(b[i]) + c == 1:
                d[i] = '1'
                c = 0 
            if int(b[i]) + c == 2:
                d[i] = '0'
                c = 1
        # print(c)
        if c == 1:
            d[0] = '1'
        if d[0] == '0': 
            return ''.join(d[1:])
        else:
            return ''.join(d)

