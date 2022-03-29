 class Solution(object):
    def XXX(self, num):
        """
        :type num: int
        :rtype: str
        """
        ref={1:'I', 5:'V', 10:'X', 50:'L', 100:'C', 500:'D', 1000:'M'}
        a=1
        result=''
        while(num>0):
            tag=num%10
            if tag==4:
                result=ref[a]+ref[5*a]+result
            elif tag==9:
                result=ref[a]+ref[10*a]+result
            elif tag==0:
                pass
            elif tag>=1 and tag<4:
                result=ref[a]*tag+result
            else:
                result=ref[5*a]+ref[a]*(tag-5)+result
            num=num//10
            a*=10
        return result

