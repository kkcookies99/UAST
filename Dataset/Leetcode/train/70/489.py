class Solution:
    def XXX(self, n: int) -> int:
        n1 = 1
        n2 = 1
        nums = 1
        if n<=1:
            return 1
        while nums < n:
            res = n1 + n2
            n1 = n2
            n2 = res
            nums += 1
        return res

