class Solution:
    def XXX(self, x: int) -> bool:
        if x<0:
            return False
        else:
            x0 =x
            s = 0
            while x>9:
                a = x%10
                s =s*10 + a
                x= x//10
            b = s*10 + x            
            return True if x0 == b else False

