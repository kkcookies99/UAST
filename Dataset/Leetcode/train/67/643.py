class Solution:
    def XXX(self, a: str, b: str) -> str:
        a = a[::-1]
        b = b[::-1]        
        add_len = max(len(a),len(b))
        if len(a) < add_len:
            for i in range(add_len - len(a)):
                a = a +'0'
        if len(b) < add_len:
            for i in range(add_len - len(b)):
                b = b+'0'
        c = ''
        up = '0'
        for i in range(add_len):
            if (a[i]+b[i]+up).count('1') == 0:
                sum , up = '0','0'
            elif (a[i]+b[i]+up).count('1') == 1:
                sum , up = '1','0'
            elif (a[i]+b[i]+up).count('1') == 2:
                sum ,up = '0' , '1'
            elif (a[i]+b[i]+up).count('1') == 3:
                sum ,up = '1', '1'
            c = c + sum
        
        if up == '1':
            c = c + up

        c = c[::-1]
        return c

