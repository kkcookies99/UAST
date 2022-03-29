class Solution:
    def XXX(self, n: int) -> int:
        # 递归树, 去重复子问题, 变向斐波那契
        # f[1] = 1
        # f[2] = 2
        # f[3] = f[1] + f[2]
        if n<=2:
            return n

        pre_pre = 1
        pre = 2
        res = 0
        for i in range(3,n+1):
            res = pre_pre + pre
            pre_pre = pre
            pre = res

        return res

