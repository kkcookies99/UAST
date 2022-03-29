 class Solution:
    def XXX(self, x: int) -> int:
        '''
        先去符号,求绝对值;
        再转换
        '''
        y=abs(x)
        z=''
        z+=str(y)
        while int(z[::-1])>=-2**31 and int(z[::-1])<=2**31-1 and x !=0:
            if x>0:
                return int(z[::-1])
            else:
                return 0-int(z[::-1])
        return 0

