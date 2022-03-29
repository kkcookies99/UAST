class Solution:
    def XXX(self, a: str, b: str) -> str:
        if a == b and a == '0':
            return '0'

        target = max(len(a), len(b))
        a = a[::-1]
        b = b[::-1]

        if len(a) < target:
            a += '0' * (target - len(a))
        if len(b) < target:
            b += '0' * (target - len(b))

        j = False # 表示是否进位
        res = str()
        for i in range(target):
            # 尝试用异或值计算
            if not j:
                res += str(int(a[i]) ^ int(b[i]))
                if a[i] == b[i] and a[i] == '1':
                    j = True
            elif j:
                res += str((int(a[i]) ^ int(b[i])) ^ 1)
                if a[i] == b[i] and a[i] == '0':
                    j = False
        
        if j:
            res += '1'
        
        return res[::-1]

