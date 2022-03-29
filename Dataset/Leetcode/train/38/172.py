class Solution:
    def XXX(self, n: int) -> str:

        res = "1"

        for i in range(1, n):

            length = len(res)
            tmp = ""
            nt = 1
            t = res[0]
            for j in range(1, length):
                
                if res[j] ==t:
                    nt += 1
                else:
                    tmp += str(nt) + str(t)
                    nt = 1
                    t = res[j]
            tmp += str(nt) + str(t)
            res = tmp    
        
        return res


