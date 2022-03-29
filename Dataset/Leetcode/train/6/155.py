 class Solution(object):
    def XXX(self, s, numRows):
        """
        :type s: str
        :type numRows: int
        :rtype: str
        """
        if numRows==1:
            return s
        a=[]
        index=0
        add = 1
        res=''
        for i in range(0,numRows):
            a.append([]);
        for x in s:
            a[index].append(x)
            index+=add
            if index ==0:
                add = 1
            if index == numRows-1:
                add = -1
        for i in range (0,numRows):
            res+="".join(a[i])
        return res```

