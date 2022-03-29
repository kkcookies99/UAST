class Solution:
    def XXX(self, x: int) -> bool:
        seq = x
        if x<0:
            return False
        if x==0:
            return True
        rev=0
        while(x!=0):
            rev=rev*10+x % 10
            x=x//10
        if rev == seq:
            return True
        else:
            return False
            

