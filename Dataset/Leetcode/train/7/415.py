 class Solution:
    def XXX(self, x: int) -> int:
        xStr=str(x)

        xEnd=re.search('0*$',xStr).start()
        
        xStart,xResultStr=(1,'-') if xStr[0]=='-' else (0,'')

        xResultStr += xStr[xEnd:xStart-len(xStr)-1:-1]
        
        result=int(xResultStr) if xResultStr!='' else 0

        xRenge=2**31
        if result>=xRenge or result<=-xRenge:
            return 0
        else:
            return result

