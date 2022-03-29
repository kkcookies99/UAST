 class Solution:
    def XXX(self, s: str) -> int:
        if len(s)==0:
            return 0
        i=0
        while s[i]==" ":
            i+=1
            if i==len(s):
                return 0
        s=s[i:]
        if s[0]!= '-' and s[0]!='+' and (s[0]<'0' or s[0]>'9'):
            return 0
        else:
            if len(s)==1 and s[0]!='-' and s[0]!='+':
                return int(s)
            elif len(s)==1 and (s[0]<'0' or s[0]>'9'):
                return 0
            i=1
            while s[i]>='0' and s[i]<='9':
                i+=1
                if i==len(s):
                    break
            if i==1 and (s[0]=='-' or s[0]=='+'):
                return 0
            else:
                num=int(s[0:i])
                if num>2**31-1:
                    return 2**31-1
                elif num<-2**31:
                    return -2**31
                else:
                    return num
        return 0

