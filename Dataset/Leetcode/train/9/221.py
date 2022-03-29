class Solution:
    def XXX(self, x: int) -> bool:
        if x<0 or (x%10 == 0 and x!=0):
            return False
        rev = 0
        while x > rev:
            rev = rev*10 + x%10
            x = int( x / 10 )

        return x == rev or x == int(rev/10)

