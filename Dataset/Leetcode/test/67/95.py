 class Solution:
    def XXX(self, a: str, b: str) -> str:
        
        s = ""    # 返回值
        carry = 0    # 进位符

        len_max = max(len(a),len(b)) + 1
        a = a.rjust(len_max).replace(' ','0')
        b = b.rjust(len_max).replace(' ','0')
        
        f = lambda x,y,z: int(x) + int(y) + int(z)

        for i in range(len_max - 1,0,-1):
            c = f(a[i],b[i],carry)
            if c == 0: s = '0' + s ; carry = 0
            elif c == 1: s = '1'+ s ; carry = 0
            elif c == 2: s = '0'+ s ; carry = 1
            elif c == 3: s = '1'+ s ; carry = 1

        return '1' + s if carry else s