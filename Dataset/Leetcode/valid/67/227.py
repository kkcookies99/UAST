 class Solution:
    def XXX(self, a: str, b: str) -> str:
        # 朴素法
        if len(a) - len(b) >= 0:
            b = '0' * (len(a) - len(b)) + b
        else:
            a = '0' * (len(b) - len(a)) + a
        # print(b)
        res = ''
        cnt = 0
        for i in range(len(a)-1,-1,-1):
            sum = int(a[i]) + int(b[i]) + cnt
            if sum >= 2:
                res = str(sum - 2) + res
                # print(res)
                cnt = 1
            else:
                res = str(sum) + res
                cnt = 0
        if cnt == 1:
            res = '1' + res
        return res

