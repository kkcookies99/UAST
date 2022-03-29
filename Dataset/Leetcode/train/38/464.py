 class Solution:
    def XXX(self, n: int) -> str:
        res = '1'
        while n > 1:
            temp = res
            res = ''
            for key, group in itertools.groupby(temp):
                res += str(len(list(group))) + key
            n -= 1
        return res

