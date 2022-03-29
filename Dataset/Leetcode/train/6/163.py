 class Solution:
    def XXX(self, s, numRows) :
        if numRows==1:return s
        
        l=[""]*numRows
        z=numRows*2-2  #2行2个一组，3行4个一组，4行6个一组

        for j in range(len(s)):
            y=j%z #余数
            
            if y<numRows:
                l[y]=l[y]+s[j]
            else:
                l[z-y]=l[z-y]+s[j]
        return "".join(l)

