 class Solution:
    def XXX(self, x):       
        result = 0
        if x == 0:
            return 0     
        elif x > 0:
            while x!=0:
                result = result*10+x%10
                x = x//10
            return 0 if result > 2**31-1 else result
        else:
            x = 0-x
            while x!=0:
                result = result*10+x%10
                x = x//10
            return 0 if result > 2**31 else 0-result

