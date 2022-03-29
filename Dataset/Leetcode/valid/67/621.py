class Solution:
    def XXX(self, a: str, b: str) -> str:
        if len(a) < len(b):
            a, b = b, a
        b = '0' * (len(a) - len(b)) + b
        c = []
        flag = 0
        for i in range(1, len(a) + 1):
            c.insert(0, str( (int(a[-i]) + int(b[-i]) + flag) % 2))
            flag = (  int(a[-i]) + int(b[-i]) + flag ) // 2
        if flag != 0:
            c.insert(0, str(flag)) 
        return ''.join(c)

