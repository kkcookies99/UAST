 class Solution:
    def XXX(self, s: str) -> str:
        n = len(s)       
        res = []
        for i in range(n):
            a,b = i,i   # 初始边界设在i
            # 上下边界扩展到相同字符的边界
            while a > 0:
                if s[i] == s[a - 1]:
                    a -= 1
                else:
                    break
            while b < n - 1:
                if s[i] == s[b + 1]:
                    b += 1
                else:
                    break
            # 按照回文规则继续扩展
            while a > 0 and b < n - 1:
                if s[a - 1] == s[b + 1]:
                    a,b = a - 1, b + 1
                else:
                    break
            if b - a + 1 >= len(res):
                res = s[a:b+1]
        return res

