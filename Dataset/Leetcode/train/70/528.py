class Solution:
    def XXX(self, n: int) -> int:
        start1, start2 = 1, 1
        for i in range(2, n+1):
            start2, start1 = start1 + start2, start2
        return start2


