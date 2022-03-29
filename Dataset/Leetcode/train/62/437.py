class Solution:
    def XXX(self, m: int, n: int) -> int:
        # m个1，n个0的排列组合
        slot = m+n-2
        small = min(m,n)-1

        result = 1
        cnt = 1
        while small>0:
            result = slot * result / cnt
            small -= 1
            slot -= 1
            cnt += 1

        return int(result)

