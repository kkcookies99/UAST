class Solution:
    def XXX(self, n: int) -> int:
        last, cur = 1, 1 
        for _ in range(n - 1):
            last, cur = cur, last + cur 
        return cur 

