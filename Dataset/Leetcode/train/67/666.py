class Solution:
    def XXX(self, a: str, b: str) -> str:
        if len(a) < len(b):
            temp = a 
            a = b 
            b = temp
        output = ''
        a_x = len(a) - 1
        b_x = len(b) - 1
        tag = 0
        while b_x>=0:
            l2 = int(a[a_x])
            l3 = int(b[b_x])
            res = int(l2+l3+tag)
            if res == 0:
                output = '0' + output
                tag = 0
            elif res == 1:
                output = '1' + output
                tag = 0
            elif res == 2:
                output = '0' + output
                tag = 1
            elif res == 3:
                output = '1' + output
                tag = 1
            a_x -= 1
            b_x -= 1
        while a_x >= 0:
            l1 = int(a[a_x])
            res = int(l1+tag)
            if res == 0:
                output = '0' + output
                tag = 0
            elif res == 1:
                output = '1' + output
                tag = 0
            elif res == 2:
                output = '0' + output
                tag = 1
            a_x -= 1
        if tag == 1:
            output = '1' + output
        return output

