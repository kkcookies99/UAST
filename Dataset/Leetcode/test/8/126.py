class Solution:
    def XXX(self, s: str) -> int:
        tmp = '0123456789'
        num = 0
        sign = 1  # 0代表负，1代表正
        is_sign = False  # 表示是否开始读数了
        for c in s:
            if is_sign:  # 开始读数了，则只接收tmp
                if c not in tmp:
                    break
                else:
                    num = num*10 + int(c)
            elif not is_sign:  # 还未开始读数，则可以接收' ', '+', '-', tmp
                if c == ' ':
                    continue
                elif c == '-':
                    sign = 0
                    is_sign = True
                elif c == '+':
                    is_sign = True
                elif c in tmp:
                    is_sign = True
                    num = int(c)
                else:
                    break

            if num>2**31-1:
                if sign:
                    return 2**31-1
                else:
                    return -2**31
                break

        if not sign:
            return -num
        else:
            return num

