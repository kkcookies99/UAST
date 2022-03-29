 class Solution:
    def XXX(self, x: int) -> bool:
        if x < 0: return False
        target = str(x)
        start = 0
        end = len(target) - 1
        while start < end:
            if target[start] != target[end]: return False
            start += 1
            end -= 1
        return True

