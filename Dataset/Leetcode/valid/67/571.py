class Solution(object):
    def XXX(self, a, b):
        """
        :type a: str
        :type b: str
        :rtype: str
        """
        i=len(a)
        j=len(b)
        x=0
        y=0
        result=0
        t=0
        if i<j: 
            a=a.zfill(j)
        else:
            b=b.zfill(i)
        for x in range(len(a)):
            y+=int(a[-1-x])+int(b[-1-x])
            result+=(y%2)*10**x
            if y//2==0:
                y,t=0,0
            else:
                y,t=1,1
        if y==1 and t==1:
            result+=int(y)*10**len(a)
        return str(result)

