 class Solution:
    def XXX(self, a: str, b: str) -> str:
        if len(a)>len(b):
            b=(len(a)-len(b))*'0'+b
        else:
            a=(len(b)-len(a))*'0'+a
        nextAdd = 0
        result=""
        for i in range(len(a)-1,-1,-1):
            iSum = int(a[i])+int(b[i])+nextAdd
            if iSum>=2:
                nextAdd = 1
                result = str(iSum-2)+result
            else:
                nextAdd = 0
                result = str(iSum)+result
        if nextAdd:
            result = '1'+result
        return result

