class Solution:
    def XXX(self, n):
        res = '1'
        for i in range(2, n+1):
            pre = res
            # print(pre)
            res = ''
            while pre:
                p = 1
                while p < len(pre) and pre[0] == pre[p]:
                    p += 1
                res += str(p) + pre[0]
                if p == len(pre):
                    pre = ''
                else:
                    pre = pre[p:]
        return res

