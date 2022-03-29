class Solution:
    def XXX(self, x: int) -> int:

        if(x>=0 and x<=2**31-1):
                    strtmp=str(x)[::-1]
                    inttmp=int(strtmp)
                    return inttmp if(inttmp<=2**31-1) else 0
        elif(x<0 and x>=-2**31):
                    k=abs(x)
                    strtmp=str(k)[::-1]
                    strtmp='-'+strtmp
                    inttmp=int(strtmp)
                    return inttmp if(inttmp>-2**31) else 0
        else:
            return 0

