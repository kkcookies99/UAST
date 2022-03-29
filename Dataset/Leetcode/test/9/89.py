class Solution:
    def XXX(self, x: int) -> bool:
        if x < 0 or x != 0 and x % 10 == 0: return False
        org,rev = x,0
        while x > 0:
            rev = 10 * rev + (x % 10)
            x //= 10
        return rev == org
        # if rev == org: 
        #     return True 
        # else:
        #     return False

