class Solution:
    def XXX(self, a: str, b: str) -> str:
        if a == '0' and b == '0':
            return '0'

        if a == '0':
            return b

        if b == '0':
            return a

        na = len(a)
        nb = len(b)
        len_max = max(na, nb)
        if nb != len_max:
            tmp = '0' * (len_max - len(b))
            b = tmp + b
        else:
            tmp = '0' * (len_max - len(a))
            a = tmp + a
        print(a)
        print(b)

        flag = 0
        res = ""
        for i in range(1, len_max+1):
            if int(a[-i]) and int(b[-i]):
                if flag:
                    res = '1' + res
                    flag = 1
                else:
                    res = '0' + res
                    flag = 1
            elif int(a[-i]) or int(b[-i]):
                if flag:
                    res = '0' + res
                    flag = 1
                else:
                    res = '1' + res
            else:
                if flag:
                    res = "1" + res
                    flag = 0
                else:
                    res = "0" + res  
        if flag:
            res = "1" + res 
            flag = 0
        return res


