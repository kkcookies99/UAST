class Solution:
    def XXX(self, n: int) -> int:
        num = 0
        for i in range(n//2+1):
            num += comb(n-i,i)
        return num

