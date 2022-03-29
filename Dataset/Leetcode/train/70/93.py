class Solution:
    def XXX(self, n: int) -> int:
        i = 1
        j = 2
        for _ in range(3, n):
            i, j = j, i + j
        
        return i + j if n > 2 else n

