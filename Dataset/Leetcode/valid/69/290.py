class Solution:
    def XXX(self, x: int) -> int:
        if x==0 : return 0
        a = x / 2
        
        while True:
            update = a - (a*a-x) / (2 * a)
            if abs(update - a) < 1 : break
            else:
                a = update
        return int(update)

