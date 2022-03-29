class Solution:
    def XXX(self, x: int) -> int:
        if x == 0:
            return 0
        start_x = x
        update = x / start_x
        while start_x - update > 0.5:
            update = x / start_x
            start_x = (start_x + update)*0.5
        return int(start_x)

