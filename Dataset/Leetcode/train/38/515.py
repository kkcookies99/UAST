 class Solution:
    def XXX(self, n: int) -> str:
        if n == 1: return "1" 
        cur = "1"
        for i in range(1,n):
            t = ""
            i = 1
            count = 1 
            while i < len(cur):
                if cur[i] != cur[i-1]:
                    t += str(count) + cur[i-1]
                    count = 1 
                elif cur[i] == cur[i-1]:
                    count += 1 
                i += 1
            t +=  str(count) + cur[i-1] 
            cur = t 
        return cur 

