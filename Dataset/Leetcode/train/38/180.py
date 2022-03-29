class Solution:
    def XXX(self, n: int) -> str:
        c_rst = '1'
        while n > 1:
            n -= 1
            rst = ''
            last = c_rst[0]
            if c_rst == '1':
                c_rst = '11'
                continue
            c = ''
            flag = 1
            for i in c_rst[1:]:
                c = i
                if c != last:
                    rst += str(flag) + last
                    flag = 0
                flag += 1
                last = c
            rst += str(flag) + c
            c_rst = rst
        return c_rst

