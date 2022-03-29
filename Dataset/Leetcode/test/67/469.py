class Solution(object):
    def XXX(self, a, b):
        t=len(b)-len(a)
        b=-t*'0'+b
        a=t*'0'+a
        count=0
        result=""

        for i in range(1,1+len(a)):
            c=( int(a[-i])+int(b[-i])+count )
            count=c//2
            result=str(c%2)+result
        if count==1:
            result='1'+result
        return result

