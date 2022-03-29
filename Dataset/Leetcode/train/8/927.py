 class Solution(object):
    def XXX(self, str):
        """
        :type str: str
        :rtype: int
        """
        c=0
        d=0
        if str=="":
            return 0
        if len(str)==1 and str not in "0123456789":
            return 0
        elif len(str)==1 and str in "0123456789":
            return int(str)
        n=0
        for i in str:
            if i!=" ":
                c=n
                break
            n+=1 
            # print(n)
        if str[c]!="-" and str[c] not in"0123456789" and str[c]!="+":
            return 0
        # n=c+1      
        for i in range(c+1,len(str)):            
            if str[i] not in "0123456789" :
                d=i
                # print (d)
                break
            if i==len(str)-1:
                d=len(str)
        if d==(c+1) and str[d-1] not in "0123456789":
            return 0
        # print(c,d)
        e=int(str[c:d])
        if e>(2**31)-1:
            return 2**31-1
        elif e<(-2**31):
            return -2**31
        return e

