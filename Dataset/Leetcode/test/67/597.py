class Solution:
    def XXX(self, a: str, b: str) -> str:
        res = ''
        if len(a) >len(b):
            # c=b  #a代表短的那一个
            # b = a
            # a = c
            b = '0'*(len(a)-len(b)) + b
        elif len(a) < len(b):
            a = '0'*(len(b)-len(a)) + a
        pre = '0'
        for i in range(-1, -len(a)-1, -1):
            if a[i] == '0':
                if b[i] == '0':
                    res = pre + res
                    pre = '0'
                else:
                    if pre == '0':
                        res = '1' + res
                        pre = '0'
                    else:
                        res = '0' + res
                        pre = '1'
            else:
                if b[i] == '0':
                    if pre == '0':
                        res = '1' + res
                        pre = '0'
                    else:
                        res = '0' + res
                        pre = '1'
                else:
                    if pre == '0':
                        res = '0' + res
                        pre = '1'
                    else:
                        res = '1' + res
                        pre = '1'
        if pre == '1':
            res = '1' + res
        return res
        



