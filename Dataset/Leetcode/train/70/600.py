class Solution:
    def XXX(self, n: int) -> int:
        cs = [1 , 2]
        if n <= 2:
            return cs[n-1]
        else:
            for i in range(2,n):
                cs.append(cs[i-2]+cs[i-1])
        return cs[-1]

