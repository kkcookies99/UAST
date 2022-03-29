class Solution:
    def XXX(self, num: int) -> int:
        if 2**31-1>num>0:
            s=str(num)
            result=eval(s[-1::-1].strip('0'))
            return result if 2**31-1>result>0 else 0
        elif num==0:
            return num
        elif (-2**31)<=num<0:
            num=abs(num)
            s=str(num)
            result = -eval(s[-1::-1].strip('0'))
            return result if (-2**31)<=result<0 else 0
        else:
            return 0

